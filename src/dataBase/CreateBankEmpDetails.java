package dataBase;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class CreateBankEmpDetails {

    public static void main(String args[]) throws Exception {

        CreateBankEmpDetails obj = new CreateBankEmpDetails();
       // obj.create_Bank_Emp_Table();
        obj.Read_EmpTable();

    }



    public void create_Bank_Emp_Table(){


        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SimpliLearn","root","password");
            Statement stmt = con.createStatement();
            // Select /use The Data Base
           // stmt.executeQuery("use SimpliLearn;");
            //Create a Table inside the Database...

            //Insert Data into the Table...
           /* if (con !=null) {
                System.out.println("Connection is successful");
            }*/


          /*stmt.execute("create table BankEmp" +
                    "(" +
                    "EmpId int not null," +
                    "Mobile double," +
                    "FName varchar(50)," +
                    "LName varchar(50)," +
                    "Email varchar(50)," +
                    "State varchar(20)," +
                    "Doj date," +
                    "Vehicle varchar(200)" +
                    ");");*/
            //stmt.execute("insert into BankEmp values(2,91234565, 'Bohn','Sen', 'bohn@gmail.com','GJ','2000-02-10','CAR');");
           //stmt.execute("insert into BankEmp values(1,9123456, 'John','Son', 'John@gmail.com','GJ','2000-01-10','Car');");
           // stmt.executeQuery(" insert into BankEmp values(3,9123456, 'John','Son', 'John@gmail.com','GJ','2000-01-10','Car');");
            //stmt.execute("insert into BankEmp values(4,99557766, 'Reejh','Josan', 'reej@gmail.com','GJ','2004-07-10','UTE');");
            //stmt.execute("insert into BankEmp values(5,99117766, 'Den','Duck', 'den@gmail.com','GJ','2004-06-11','UTE');");
            //stmt.execute("insert into BankEmp values(6,99227766, 'Lina','Breeze', 'lina@gmail.com','GJ','2000-05-08','UTE');");
            //stmt.execute("insert into BankEmp values(7,99337766, 'Choy','Some', 'choy@gmail.com','UP','1999-02-09','CAR');");
            //stmt.execute("insert into BankEmp values(8,99447766, 'Joe','Don', 'Joe@gmail.com','AP','2000-03-10','UTE');");
           //stmt.execute("insert into BankEmp values(9,99007766, 'Tina','Khan', 'Tina@gmail.com','TN','2001-02-09','CAR');");
            System.out.println("Table Creation is Successful ....");



            con.close();
        }catch(Exception e){ e.printStackTrace();}



    }
    public void Read_EmpTable(){


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SimpliLearn","root","password");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("select EmpId,Mobile,FName,LName,Email from BankEmp;");

            while(result.next()){
                /*int emp_ID = result.getInt("EmpId");
                Double Mo_No = result.getDouble("Mobile");
                String FirstName = result.getString("FName");
                String LastName =  result.getString("LName");
                String Email_ID = result.getString("Email");*/
                int emp_ID = result.getInt(1);
                Double Mo_No = result.getDouble(2);
                String FirstName = result.getString(3);
                String LastName =  result.getString(4);
                String Email_ID = result.getString(5);


                System.out.println(emp_ID+" : "+Mo_No+" : "+FirstName+" : "+LastName+" : "+Email_ID);
            }





            System.out.println("Table can be displayed successful ....");



            con.close();
        }catch(Exception e){ e.printStackTrace();}



    }


}
