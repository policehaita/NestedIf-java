/*Check if a number is positive,
and if it is even or odd*/
import java.util.Scanner;
public class Main {
    public static void main( String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number>0){
            System.out.println("It is positive");

             if (number%2==0) {
                System.out.println("It is even number");
            }
             else {
                System.out.println("It is odd number");
            }
        }
        else {
            System.out.println("it is negative number");

        }

        scanner.close();
    }
}
