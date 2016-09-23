/**
 * Created by webonise on 14/9/16.
 */
public class SBI implements BankInterface {
    double simpleInterest;
    double rateOfInterest=8;

    public void rateOfInterest(double principal,double numberOfYears){
        simpleInterest=(principal*rateOfInterest*numberOfYears)/100;
        System.out.println("Simple Interest for SBI with 8% rate of Interest is " + simpleInterest);
    }
}
