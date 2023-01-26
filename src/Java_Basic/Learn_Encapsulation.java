package Java_Basic;
public class Learn_Encapsulation {

    private int SSN;
    private String empName;
    private int empAge;
    private int bonus;

    public int getSSN() {
         return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
      public int getBonus(){
        int BNS = 0;
        if (SSN == 123)
        {
           BNS = 100;
        }
        if (SSN == 124)
        {
            BNS = 80;
        }
        return BNS;
      }

    public static void main(String args[]) throws Exception{
        Learn_Encapsulation obj = new Learn_Encapsulation();
        obj.setEmpAge(35);
        obj.setEmpName("Sweety");
        obj.setSSN(123);
        System.out.println("Emp Name is==> " +obj.getEmpName());
        System.out.println("Emp Age is ==> " + obj.getEmpAge());
        System.out.println("Emp SSN is ==> " + obj.getSSN());
         System.out.println("Emp Bonus is ==> " + obj.getBonus()+"%");
    }
}