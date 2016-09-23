/**
 * Created by webonise on 14/9/16.
 */
public class MainBankClass {
    public static void main(String[] args){
        BankInterface sbi=new SBI();
        sbi.rateOfInterest(3000,2);

        BankInterface icici=new ICICI();
        icici.rateOfInterest(4000,3);

        BankInterface axis=new AXIS();
        axis.rateOfInterest(5000,4);
    }
}
