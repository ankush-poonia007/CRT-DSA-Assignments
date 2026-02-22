/*10.	Write a program to check whether a character is uppercase or lowercase alphabet
________________________________________
Output
Enter the Character :t
This is a Lowercase Alphabet

Enter the Character :D
This is a Uppercase Alphabet
*/
import java.util.Scanner;

public class check_aplhabet_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Values :");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' ) {
            System.out.println("This is a Small Alphabet");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This is a Number");
        } else {
            System.out.println("This is a Not an Alphabet");
        }
    }
}