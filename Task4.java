import java.util.Scanner;

public class Homework2
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
         Scanner iScanner = new Scanner(System.in);
         System.out.printf("Введите последовательно 2 числа, а затем знак +,- или * ");
         int a = iScanner.nextInt();
         int b = iScanner.nextInt();
         String type = iScanner.next();
         int res = 0;
             switch (type) 
             {
                 case "+":   res = a + b;
                             sb.append(a); sb.append("+"); sb.append(b); sb.append("="); sb.append(res);
                             break;
                 case "-":   res = a - b;
                             sb.append(a); sb.append("-"); sb.append(b); sb.append("="); sb.append(res);
                             break;
                 case "*":   res = a * b;
                             sb.append(a); sb.append("*"); sb.append(b); sb.append("="); sb.append(res);
                             break;
                 default:
                             System.out.println("Ошибка ввода. Повторите еще раз");
                             break;
             }
         System.out.println(sb);
    }
}