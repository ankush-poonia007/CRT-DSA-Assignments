
import java.util.Scanner;


/*14.	Write a program to input angles of a triangle and check whether triangle is valid or not
________________________________________
Output
Enter Three Angles of Triangle :
65
45
60
Triangle is not valid
*/

public class triangle_validation_14{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Three Angles of Triangles :");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        
        System.out.println( ( angle1 +angle2 + angle3) == 180 ? "Triangle is Valid":"Triangle is  not Valid") ;
        
        
    }
}