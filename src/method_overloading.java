public class method_overloading {

    public static void main (String args[]) throws Exception{
        method_overloading obj = new method_overloading();
        obj.Addition(10, 20);
        obj.Addition(1,2,3);
    }
    public void Addition(int a, int b){
        int add =a+b;
        System.out.println(add);
    }
    public void Addition(int a, int b, int c){
        int add= a+b+c;
        System.out.println(add);

    }
}
