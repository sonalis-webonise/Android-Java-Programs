import java.util.Scanner;

/**
 * Created by webonise on 13/9/16.
 */
public class daysInMonth {
    public static void main(String[] args){
        String month;
        System.out.print("Enter the month : ");
        Scanner scanner=new Scanner(System.in);
        month=scanner.next();

        if(month.equalsIgnoreCase("January")){
            System.out.print("31 days");
        }
        else if (month.equalsIgnoreCase("February")){
            System.out.print("28 days");
        }
        else if (month.equalsIgnoreCase("March")){
            System.out.print("31 days");
        }
        else if (month.equalsIgnoreCase("April")){
            System.out.print("30 days");
        }
        else if (month.equalsIgnoreCase("May")){
            System.out.print("31 days");
        }
        else if (month.equalsIgnoreCase("June")){
            System.out.print("30 days");
        }
        else if (month.equalsIgnoreCase("July")){
            System.out.print("31 days");
        }
        else if (month.equalsIgnoreCase("August")){
            System.out.print("31 days");
        }
        else if (month.equalsIgnoreCase("September")){
            System.out.print("30 days");
        }
        else if (month.equalsIgnoreCase("October")){
            System.out.print("31 days");
        }
        else if (month.equalsIgnoreCase("November")){
            System.out.print("30 days");
        }
        else if (month.equalsIgnoreCase("December")){
            System.out.print("31 days");
        }

    }
}
