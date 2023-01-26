package Advanced_JDBC;

import java.sql.*;
import java.util.Queue;

public class Auto_Transaction_Management {
    public static void main(String args[]) throws Exception {
        //Create_Simple_Stored_Procedure();
        UseOfSetAutoCommit();
    }
    //This method will create a stored procedure....

    public static void UseOfSetAutoCommit() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SimpliLearn", "root", "password");
            Statement stmt = con.createStatement();
            stmt.execute("use SimpliLearn");
            con.setAutoCommit(false);

         //This is Transaction 1...
            String query = "update BankEmp set DOJ =\"2000-01-08\" where EmpId = 1;";
            stmt.execute("use SimpliLearn");
            int res = stmt.executeUpdate(query);
            System.out.println("Transaction 1 ==> Numbers of row updated because of query=="+res);

            //This is Transaction 2 .....

            String query1 = "update BankEmp set DOJ =\"2000-01-08\" where EmpId = 2;";
            stmt.execute("use SimpliLearn");
            int res1 = stmt.executeUpdate(query1);

            System.out.println("Transaction 2 ==> Number of rows updated because of query=="+res1);



            con.commit();

            // System.out.println("The Stored Procedure With Name JDBC_With_2_Parameters is Created Successfully ....");
        }

            catch(Exception e){
            System.out.println(e.getMessage());}

    }
}


