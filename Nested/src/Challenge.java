/*If marks are greater than or equal to 90, print "Grade A"

If marks are 80 to 89, print "Grade B"

If marks are 70 to 79, print "Grade C"

If marks are below 70, print "Fail"*/

import java.util.Scanner;
public class Challenge {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        double marks;

        System.out.println("Please enter your marks:");
        marks = scanner.nextDouble();

        if (marks>=70){
            if(marks>=90) {
                System.out.println("Grade A");
            }
            else{
                if (marks>=80) {
                    System.out.println("Grade B");
                }
                else{
                    System.out.println("Grade C");
                }

            }

        }

        else {
            System.out.println("Fail, Better luck next time");

        }

        scanner.close();
    }
}
