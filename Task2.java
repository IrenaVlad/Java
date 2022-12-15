import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("Введите число ");
       int a = iScanner.nextInt();
       System.out.println(Integer.toBinaryString(a).length());
       iScanner.close();
    }
}    