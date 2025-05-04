/*Write a Java program that checks whether a person is eligible to vote and if they are,
        check if they are also eligible to be a candidate in an election.*/

import java.util.Scanner;
public class Try {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age>=18){
            System.out.println("You can vote");

            if (age>=25){
                System.out.println("You are eligible to be a Election candidate");
            }
        }
        else {
            System.out.println("You must be 18 years old to vote!");
        }


        scanner.close();
    }
}
