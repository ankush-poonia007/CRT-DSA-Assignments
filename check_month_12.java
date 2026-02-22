import java.util.Scanner;

/*12.	Write a program to input month number and print month Name
________________________________________
Output
Enter the Month Number(1-12) :10
This is a October
*/

public class check_month_12{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Month Number(1-12) : ");

        int choice = sc.nextInt();

        switch(choice) {
            case 1  -> System.out.println("This is January");
            case 2  -> System.out.println("This is February");
            case 3  -> System.out.println("This is March");
            case 4  -> System.out.println("This is April");
            case 5  -> System.out.println("This is May");
            case 6  -> System.out.println("This is June");
            case 7  -> System.out.println("This is July");
            case 8  -> System.out.println("This is August");
            case 9  -> System.out.println("This is September");
            case 10 -> System.out.println("This is October");
            case 11 -> System.out.println("This is November");
            case 12 -> System.out.println("This is December");
            default -> System.out.println("Enter a Valid Choice");
        }
    }
}