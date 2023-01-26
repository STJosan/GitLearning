package Advanced_JDBC;

import java.sql.*;

public class Call_Stored_Procedure {

    public static void main (String args[] )throws Exception {
     // Call_Stored_Procedure_with_2_Para("Car","GJ");
        Call_Stored_Procedure_Without_Parameter();
    }

    public static void Call_Stored_Procedure_with_2_Para(String Vehicle, String State) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SimpliLearn","root","password");
            //Statement stmt = con.createStatement();
            String Query = "{call SP_With_2_Para(?,?)}";


            CallableStatement STMT = con.prepareCall(Query);
            STMT.execute("use SimpliLearn;");
            STMT.setString(1,Vehicle);
            STMT.setString(2,State);

            ResultSet result = STMT.executeQuery();

            while(result.next())
            {
                int ID = result.getInt("EmpId");
                String FName = result.getString("FName");
                String LName = result.getString("LName");
                String vehicle  = result.getString("Vehicle");
                String state = result.getString("State");
               //String state = result.getString("State");
                System.out.println(ID+ ":"+FName+ ":"+LName+ ":"+vehicle+":"+State);
            }

            System.out.println("The Stored Procedure is calling Successfully ....");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void Call_Stored_Procedure_Without_Parameter() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SimpliLearn","root","password");
            //Statement stmt = con.createStatement();

            String Query = "{call SP_Cp()}";

            CallableStatement STMT = con.prepareCall(Query);
            STMT.execute("use SimpliLearn;");
           // STMT.setString(1,Vehicle);
            //STMT.setString(2,State);

            ResultSet result = STMT.executeQuery();

            while(result.next())
            {
                int ID = result.getInt("EmpId");
                String FName = result.getString("FName");
                String LName = result.getString("LName");
                String vehicle  = result.getString("Vehicle");
                String state = result.getString("State");
                //String state = result.getString("State");
                System.out.println(ID+ ":"+FName+ ":"+LName+ ":"+vehicle+":"+state);
            }

            System.out.println("The Stored Procedure is calling Successfully ....");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
