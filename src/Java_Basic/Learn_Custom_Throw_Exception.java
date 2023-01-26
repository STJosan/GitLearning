package Java_Basic;

public class Learn_Custom_Throw_Exception {


    public static void main (String args[]){

        Learn_Custom_Throw_Exception obj = new Learn_Custom_Throw_Exception();
        obj.Delhi_Public_School(9);

    }

    public void Delhi_Public_School(int Student_Age){
        if (Student_Age > 10){
            throw new ArithmeticException("Sorry your Kid is not eligible");
        }
        if (Student_Age <10){
            System.out.println("Welcome to Delhi Public School");
        }
    }
}
