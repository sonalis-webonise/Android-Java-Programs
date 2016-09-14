/**
 * Created by webonise on 14/9/16.
 */
public class AXIS implements BankInterface {
    double simpleInterest;
    double rateOfInterest=9;

    public void rateOfInterest(double principal,double numberOfYears){
        simpleInterest=(principal*rateOfInterest*numberOfYears)/100;
        System.out.println("Simple Interest for AXIS with 9% rate of Interest is " + simpleInterest);
    }
}
