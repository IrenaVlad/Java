import java.util.Random;
import java.util.ArrayList;


public class Homework1
{
    public static void main(String[] args) {
        int a = new Random().nextInt(Short.MAX_VALUE);
        System.out.println(a);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (a < Short.MAX_VALUE) {
            if (a%2 !=0) {
                arr.add(a);
            }
            a++;
        }
        System.out.println(arr.toString());
           
    }
}