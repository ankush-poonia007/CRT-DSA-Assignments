
import java.util.Scanner;


/*11.	Write a program to input week number and print week day
________________________________________
Output
Enter the Week Number(1-7) :5
This is a Thursday
*/

public class check_week_11{
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            System.out.println("Enter the Week Number(1-7) : ");

            int choice = sc.nextInt();

            switch(choice) {
                case 1 -> System.out.println("This is Sunday");
                case 2-> System.out.println("This is Monday");
                case 3-> System.out.println("This is Tuesday");
                case 4-> System.out.println("This is Wednesday");
                case 5-> System.out.println("This is Thursday");
                case 6-> System.out.println("This is friday");
                case 7-> System.out.println("This is Saturday");
                default -> System.out.println("Enter a Valid Choice");
            }
    }
}