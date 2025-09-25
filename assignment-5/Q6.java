class Bank{
    float getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    float getRateOfInterest(){return 8;}
}
class ICICI extends Bank{
    float getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    float getRateOfInterest(){return 9;}
}
public class Q6{
    public static void main(String[] args){
        Bank sbi=new SBI();
        Bank icici=new ICICI();
        Bank axis=new AXIS();
        System.out.println("SBI Rate of Interest : "+sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest : "+icici.getRateOfInterest());
        System.out.println("AXIS Rate of Interest : "+axis.getRateOfInterest());
    }
}
