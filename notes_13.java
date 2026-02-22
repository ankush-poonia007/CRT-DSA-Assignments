import java.util.Scanner;

/*13.	Write a program to count total number of notes in given amount
________________________________________
Output
Enter the Amount :
158388
Total Number of Notes
500 = 316
100 = 3
50 = 1
20 = 1
10 = 1
5 = 1
2 = 1
1 = 1
*/

public class notes_13{
    static public void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.err.println("Enter the Amount:");
        int amount = sc.nextInt();

        int notes_500 = (amount / 500); 
        amount %= 500;

        int notes_100 = (amount / 100);
        amount %= 100;

        int notes_50 = (amount / 50);
        amount %= 50;

        int notes_20 = (amount / 20);
        amount %= 20;

        int notes_10 = (amount / 10);
        amount %= 10;

        int notes_5 = (amount / 5);
        amount %= 5;

        int notes_2 = amount / 2;
        amount %= 2;

        int notes_1 = amount;

        System.err.println("500 ="+ notes_500);
        System.err.println("100 ="+ notes_100);
        System.err.println("50 ="+ notes_50);
        System.err.println("20 ="+ notes_20);
        System.err.println("10 ="+ notes_10);
        System.err.println("5 ="+ notes_5);
        System.err.println("2 ="+ notes_2);
        System.err.println("1 ="+ notes_1);
    }
}