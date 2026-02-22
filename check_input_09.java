import java.util.Scanner;

/*9.	Write a program to input any character and check whether it is alphabet, digit or special character
________________________________________
Output
Enter the Values :34
This is a Number

Enter the Values :d
This is a Alphabet

Enter the Values :%
This is a Special Character
*/

public class check_input_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Values :");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("This is a Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("This is a Number");
        } else {
            System.out.println("This is a Special Character");
        }
    }
}