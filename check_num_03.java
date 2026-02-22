/*
3.	Write a program to check whether a number is negative, positive or zero
________________________________________
Output
Enter the Number  : 45
Positive Number

Enter the Number  : -4
Negative Number
*/
import java.util.Scanner;
public class check_num_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number  : ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println("Positive Number");
            } else if (num < 0) {
                System.out.println("Negative Number");
            } else {
                System.out.println("Zero");
            }
        }
    }
}