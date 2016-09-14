import java.util.Scanner;

/**
 * Created by webonise on 14/9/16.
 */
public class daysUsingSwitch {

        public static void main(String[] args){
            int monthNumber;
            String daysOfMonth;
            System.out.print("Enter the month number: ");
            Scanner scanner=new Scanner(System.in);
            monthNumber=scanner.nextInt();
            switch(monthNumber){
                case 1 :
                    daysOfMonth="January : 31";
                    break;
                case 2 :
                    daysOfMonth="February : 28";
                    break;
                case 3 :
                    daysOfMonth="March : 31";
                    break;
                case 4 :
                    daysOfMonth="April : 30";
                    break;
                case 5 :
                    daysOfMonth="May : 31";
                    break;
                case 6 :
                    daysOfMonth="June : 30";
                    break;
                case 7 :
                    daysOfMonth="July : 31";
                    break;
                case 8 :
                    daysOfMonth="August : 31";
                    break;
                case 9 :
                    daysOfMonth="September : 30";
                    break;
                case 10 :
                    daysOfMonth="October : 31";
                    break;
                case 11 :
                    daysOfMonth="November : 30";
                    break;
                case 12 :
                    daysOfMonth="December : 31";
                    break;
                default:
                    daysOfMonth="Invalid Month";
            }
            System.out.println(daysOfMonth);
        }
}
