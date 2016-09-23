import java.util.Scanner;

/**
 * Created by webonise on 22/9/16.
 */
public class CalculatorMain extends Calculator {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double sum;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number : ");
        num1 = scanner.nextDouble();
        System.out.print("Second Number : ");
        num2 = scanner.nextDouble();
        System.out.println("What would you like to do? \n 1.Add + \n 2.Subtract - \n 3.Multiply * \n 4.Divide / \n 5.Exit \n What's your choice : ");
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                sum = calculator.addition(num1, num2);
                System.out.println("Addition is " + sum);
                break;
            case 2:
                sum = calculator.subtraction(num1, num2);
                System.out.println("Subtraction is " + sum);
                break;
            case 3:
                sum = calculator.multiplication(num1, num2);
                System.out.println("Multiplication is " + sum);
                break;
            case 4:
                sum = calculator.division(num1, num2);
                System.out.println("Division is " + sum);
                break;
            case 5:
                break;
            default:
                System.out.println("Please select a valid choice");

        }
    }
}
