package Java_Basic;

import java.util.HashMap;

public class learn_Hashmap {
    public static void main(String arg[]) throws Exception {
        learn_Hashmap obj = new learn_Hashmap();
        obj.implement_Hashmap();

    }
    public void implement_Hashmap(){
        HashMap<Integer, String> HM = new HashMap<>();

        HM.put(1,"Sachin");
        HM.put(2,"Geetha");
        HM.put(3,"Ravi");
        HM.put(4,"Mariana");
        HM.put(5,"Vinayak");
        HM.put(6,"Vindya");
        HM.put(7,"Raj");
        HM.put(8,"Neha");
        HM.put(9,"Nisha");
        HM.put(10,"Mithun");
        System.out.print(HM.get(6));
        System.out.println(HM);

        HM.remove(10);
        System.out.println(HM);

        //How to iterate HasMAp? Example of for each loop as it has : symbol
        for (int i:HM.keySet()){
            System.out.println("When Key Value is  "  +i+ " "+ "Then its corresponding value is ==> " + HM.get(i));
        }
    }
}
