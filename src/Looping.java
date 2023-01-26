public class Looping {
    static int First_Class = 800;
    static int Pass_Mark = 300;
    public static void main(String args[])throws Exception {
    // testStudent_Grade(900);
       // run_A_For_Loop(5);
        Looping obj = new Looping();
      obj.While_Loop();
      obj.reverse_For(5);

    }




    public static void testStudent_Grade(int Student_Marks){
        if (Student_Marks>=First_Class){
            System.out.println("Congrats: You got First Class ");
        }
        else if (Student_Marks<First_Class && Student_Marks>Pass_Mark){
            System.out.println("Congrats: You got Second Class");
        }
        else{
            System.out.println("Sorry you fail in the exam...");

        }
    }
   public static void run_A_For_Loop(int theMaximum){
        for(int i=1; i<=theMaximum; i++){
            System.out.println("The Number is ==>"+i);
        }

        }
        public void While_Loop(){

        int a = 5;
        while (a>=1){
            System.out.println(a);
            a--;
        }

        }
        public void reverse_For(int theMax){
        for (int i=theMax ; i>0 ; i--){
            System.out.println("The Number is ==>" +i);
        }
        }
    }
