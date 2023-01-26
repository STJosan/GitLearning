package Java_Basic;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class learn_Array_List {

    // To avoid static we can use object learn_array_List obj = new learn_Array_List();
    public static void main(String args[]) throws Exception{
        LearnArrayList();
        Array_List_Integer();
    }
    public static void LearnArrayList(){

        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Cyber Security Certification Course");
        obj.add("Data Science Certification Program");
        obj.add("Cloud Computing Certification Course");
        obj.add("Full Stack Certification Course");

        //How to display array list data???

        // To add some data in an Arraylist
        obj.add(3 ,"Mithun Teaching Java");
        System.out.println(obj);
        //To delete some data in an Array Lists
        obj.remove(3);
        System.out.println(obj);

// Iterating Array List

        for (String str:obj){
            System.out.println(str);
            if(str.equalsIgnoreCase("Data Science Certification Program")){
                break;
            }
        }
    }
    public static void Array_List_Integer(){
        ArrayList<Integer> obj1 = new ArrayList<>();
        // Iterating Array List


        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);
        obj1.add(6);

        System.out.println(obj1);
        obj1.add(1,7);
        System.out.println(obj1);
        //To delete some data in an Array Lists
        obj1.remove(1);
        System.out.println(obj1);

    }
}
