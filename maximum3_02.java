/*2.	Write a program to find maximum between three numbers
Output
Enter the Number 1 : 23
Enter the Number 2 : 78
Enter the Number 3 : 90
Maximum Number is 90
*/
import java.util.Scanner;
public class maximum3_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number 1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Number 2 : ");
            int num2 = sc.nextInt();
            System.out.print("Enter the Number 3 : ");
            int num3 = sc.nextInt();
            
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("Maximum Number is " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("Maximum Number is " + num2);
            } else {
                System.out.println("Maximum Number is " + num3);
            }
        }
    }
}