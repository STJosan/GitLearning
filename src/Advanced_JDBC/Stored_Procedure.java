package Advanced_JDBC;

import java.sql.*;

public class Stored_Procedure {
    public static void main(String args[] ) throws Exception {
        //Create_Simple_Stored_Procedure();
        Create_Simple_Stored_Procedure_with_2_Para();
    }
    //This method will create a stored procedure....

    public static void Create_Simple_Stored_Procedure() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SimpliLearn","root","password");
            Statement stmt = con.createStatement();
            stmt.execute("use SimpliLearn");

            String myQuery = "Create Procedure JDBC_Simple_CP()" +
                    "                    Begin" +
                    "                    Select * from BankEmp;" +
                    "                    End"
                    ;

            // Execute the Query ..

            stmt.execute(myQuery);

            System.out.println("The Stored Procedure With Name JDBC_Simple_CP Created Successfully ....");


           /* String myQuery = "CREATE PROCEDURE SP_Cp ()" +
                    "BEGIN" +
                    "SELECT * From BankEmp;" +
                    "END";
            //Execute the query
            stmt.execute(myQuery);*/


        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void Create_Simple_Stored_Procedure_with_2_Para() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SimpliLearn","root","password");
            Statement stmt = con.createStatement();
            stmt.execute("use SimpliLearn");

            /*String myQuery = "Create Procedure SP_With_2_para(trans  varchar(10), St varchar(10) )" +
                    "Begin" +
                    "select EmpId, Mobile, FName, LName, Vehicle, state From BankEmp where Vehicle = trans and State = St;" +
                    "End ";*/
            String myQuery = "Create Procedure SP_With_2_Para(trans  varchar(10), St varchar(10) )\n" +
                    "Begin\n" +
                    "select EmpId, Mobile, FName, LName, Vehicle, State From BankEmp where Vehicle = trans and State = St;\n" +
                    "End ";


                    /*"Create Procedure SP_With_2_para(trans  varchar(10), St varchar(10) )" +
                    "Begin" +
                    "select EmpId, Mobile, FName, LName, Vehicle From BankEmp where Vehicle = trans and State = St;" +
                    "End ";*/

            // Execute the Query ..

            stmt.execute(myQuery);

            System.out.println("The Stored Procedure With Name JDBC_With_2_Parameters is Created Successfully ....");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
