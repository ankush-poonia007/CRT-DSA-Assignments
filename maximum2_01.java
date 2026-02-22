/*1. Write a program to find maximum between two numbers
Output:
    Enter the Number1 : 56
    Enter the Number2 : 34
    Maximum Number is 56
*/

import java.util.Scanner;
public class maximum2_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Number2 : ");
            int num2 = sc.nextInt();
            
            if (num1 > num2) {
                System.out.println("Maximum Number is " + num1);
            } else if (num2 > num1) {
                System.out.println("Maximum Number is " + num2);
            } else {
                System.out.println("Both numbers are equal.");
            }
        }
    }
}