package Floor_1;

public class Flat_B1 {

    public static int FatherHasShare =3000;

    public static String bankInterestRate(String bankName){

        String rate = null;

        if(bankName.equals("JPMC")) {rate="6.6%";}
        if(bankName.equals("WellsFargo")) {rate="7.6%";}
        if(bankName.equals("ICICI")) {rate="8.6%";}
        if(bankName.equals("SBI")) {rate="9.6%";}
        if(bankName.equals("HSBC")) {rate="10.6%";}
        return rate;
    }

}

