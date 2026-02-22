/*
5.	Write a program to check whether a number is even or odd
________________________________________
Output
Enter the Number  : 51
Odd Number
*/

import java.util.Scanner;

public class even_odd_05 {

    public static void main (String [] args ){

        Scanner sc = new Scanner ( System.in);    

        System.out.println("Enter the Number :");

        int num = sc.nextInt();

        if (num%2 == 1) {
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is Even");
        }
    }
}
