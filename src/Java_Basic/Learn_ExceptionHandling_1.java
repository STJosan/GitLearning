package Java_Basic;

public class Learn_ExceptionHandling_1 {

    public String applicationURL = "https://www.google.com";

    public static void main(String args[]){

    Learn_ExceptionHandling_1 obj = new Learn_ExceptionHandling_1();
    obj.doSomeOperations();
     }
    public void doSomeOperations(){

        try {
            int a = 100  /0;
        }
        catch (Exception e){
            System.out.println("There is some error with a");

        }
        System.out.println(applicationURL.length());
        System.out.println("This is my next test scripts validation / development of Application...");

    }

    public void doGoogleHomePageHeaderValidation(){

        try{

        }

        catch(Exception e){
            System.out.println("");
        }
        finally {
            System.out.println("Here is my closing the application");
        }
    }
}
