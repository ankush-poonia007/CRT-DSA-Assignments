/*
6.	Write a program to check whether a year is leap year or not
________________________________________
Output
Enter the Year :2000
Year 2000 is a Leap Year
*/
import java.util.Scanner;

public class leap_year_06 {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Year :");
        int year = sc.nextInt();

        if ( year % 4 == 0){
            if (year %100 == 0){
                 if (year % 400 == 0 ){
                    System.out.println("Year " + year + " is a Leap Year");
                 }
                else {
                    System.out.println("Year " + year + " is Not a Leap Year");
                 }

            }
            else {
                System.out.println("Year " + year + " is a Leap Year");
            }
        
        }
        else{
            System.out.println ( "Year " + year + " is Not a Leap Year");
        }
    }
}