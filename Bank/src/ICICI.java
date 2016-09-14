/**
 * Created by webonise on 14/9/16.
 */
public class ICICI implements BankInterface {
    double simpleInterest;
    double rateOfInterest=7;

    public void rateOfInterest(double principal,double numberOfYears){
        simpleInterest=(principal*rateOfInterest*numberOfYears)/100;
        System.out.println("Simple Interest for ICICI with 7% rate of Interest is " + simpleInterest);
    }
}
