
import java.util.Scanner;

/*
7.	Write a program to check whether a character is alphabet or not
________________________________________
Output
Enter the Character :s
This is a Alphabet
*/

public class alphabet_07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Character :");

        char ch = sc.next().charAt(0);

        if ( (ch >= 'a' && ch <= 'z' ) || ( ch >= 'A' && ch <= 'Z')){
            System.out.println("This is a Alphabet");
        }
        else {
            System.out.println("This is Not a Alphabet");
        }
    }
}