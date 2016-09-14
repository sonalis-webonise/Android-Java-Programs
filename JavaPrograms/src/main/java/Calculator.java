import java.util.Scanner;

/**
 * Created by webonise on 14/9/16.
 */
public class Calculator {

    public static void main(String[] args){
        int num1=0;
        int num2=0;
        float sum;

        Scanner scanner=new Scanner(System.in);
        System.out.print("First Number : ");
        num1=scanner.nextInt();
        System.out.print("Second Number : ");
        num2=scanner.nextInt();
        System.out.println("What would you like to do? \n 1.Add + \n 2.Subtract - \n 3.Multiply * \n 4.Divide / \n 5.Exit \n What's your choice : ");
        int ch=scanner.nextInt();


            switch (ch) {
                case 1:
                    sum = num1 + num2;
                    System.out.println("Addition is " + sum);
                    break;
                case 2:
                    sum = num1 - num2;
                    System.out.println("Subtraction is " + sum);
                    break;
                case 3:
                    sum = num1 * num2;
                    System.out.println("Multiplication is " + sum);
                    break;
                case 4:
                    sum = num1 / num2;
                    System.out.println("Division is " + sum);
                    break;
                case 5:
                    break;

                default:
                    System.out.println("Please select a valid choice");
            }
    }
}
