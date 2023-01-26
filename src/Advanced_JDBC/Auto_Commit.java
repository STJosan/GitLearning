package Advanced_JDBC;

import java.sql.*;
import java.util.Queue;

public class Auto_Commit {
    public static void main(String args[]) throws Exception{


        //Create_Simple_Stored_Procedure();
        UseOfSetAutoCommit();



    }

    // This method will Create a Stored Procedure ...

    public static void UseOfSetAutoCommit() throws  SQLException{

        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "password");

            Statement stmt = conn.createStatement();

            String query = "update BankEmp set DOJ = '2000-04-04' where EmpId = 1;";

            conn.setAutoCommit(false);

            // This is Transaction 1 .....

            stmt.execute("use SimpliLearn;");
            int result = stmt.executeUpdate(query);

            System.out.println("Transaction 1 ==>Numbers of row updated because of this Query ===="+result);



            // This is Transaction 2 .....

            String query1 = "update BankEmp set DOJ = '2000-03-03' where EmpId = 2;";

            stmt.execute("use SimpliLearn;");
            // This is Transaction 1 .....

            stmt.execute("use SimpliLearn;");
            int result1 = stmt.executeUpdate(query1);

            System.out.println("Transaction 2 ==>Numbers of row updated because of this Query ===="+result1);
            conn.commit();

        }

        catch (Exception e){
            System.out.println(e.getMessage());
        };

    }


}
