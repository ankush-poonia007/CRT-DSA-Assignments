
import java.util.Scanner;

/*
8.	Write a program to input any alphabet and check whether it is vowel or consonant
________________________________________
Output
Enter the Character :O
This is a Vowel
*/
 
public class vowels_08{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Character :");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
       

        if ( ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            String vowels = "aeiouAEIOU";
            if (vowels.indexOf(ch) != -1) {
                System.out.println("This is a Vowel");
            }

             else {
                 System.out.println("This is not a Vowel");
             }
        } else {
            System.out.println("This is Not an Alphabet");
        }
    }
}