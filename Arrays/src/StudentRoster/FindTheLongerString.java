package StudentRoster;
import java.util.Scanner;
public class FindTheLongerString {
    public static void findString(){
        Scanner text = new Scanner(System.in);

        String text1 = text.next();
        String text2 = text.next();

        int length1 = text1.length();
        int length2 = text2.length();

        if(length1 > length2){
            System.out.println(text1);
        } else {
            System.out.println(text2);
        }
    }
}
