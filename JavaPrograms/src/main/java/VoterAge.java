import java.util.Scanner;

/**
 * Created by webonise on 13/9/16.
 */
public class VoterAge {

    public static void main(String[] args){

        int age;
        System.out.print("What is your age : ");
        Scanner scanner=new Scanner(System.in);
        age=scanner.nextInt();

        if (age<18){
            System.out.println("You are not eligible to vote");
        }
        else {
            System.out.println("You are eligible to vote");
        }
    }

}
