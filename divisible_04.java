


/*4.	Write a program to check whether a number is divisible by 5 and 11 or not
________________________________________
Output
Enter the Number  : 55
This Number is Divisible by 5 and 11

Enter the Number  : 125
This Number is Not Divisible by 5 and 11
*/

import java.util.Scanner;
public class divisible_04{
    public static void main( String[] args){
        
        Scanner sc = new Scanner( System.in);

        System.out.println("Enter the Number : :");

        int num = sc.nextInt();

        if ( num % 5 == 0 && num % 11 == 0 ) {
            System.out.println("This Number is Divisible by 5 and 11");
        } else {
            System.out.println("This Number is Not Divisible by 5 and 11");

        }
    }
}