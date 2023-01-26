package Java_Basic;

public class Learn_Array {

    public static void main(String args[]) throws Exception{
   // Learn_Int_Array();
    Learn_String_Array();

    }
    public static void Learn_Int_Array(){

        //How to do Array declaration ...
        // int [] num ={1,2,3,4,5,6,7,8,9}
        int[] num= {10,20,30,40,50,60,80,90};
        int array_length = num.length;
        System.out.println(array_length);
        for (int i = 0; i<array_length; i++){
           // System.out.println(i);
            System.out.println(num[i]);
        }

    }
    public static void Learn_String_Array(){
        //How to do Array declaration ...
        String bankName [] = new String[8];

        bankName[0] = "JP Bank";
        bankName[1] = "SBI Bank";
        bankName[2] = "PNB Bank";
        bankName[3] = "HSBC Bank";
        bankName[4] = "CBA Bank";
        bankName[5] = "CU Bank";
        bankName[6] = "SB Bank";
        bankName[7] = "HDFC Bank";
        for (int a =0 ; a<bankName.length ; a++){
            System.out.println(bankName[a]);

        }

    }
}
