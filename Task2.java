public class Homework2
{
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
 
    public static void main(String[] args)
    {
        String str = "Hello";
        String str2 = "olleH";
 
        str2 = reverse(str2);

       if (str.equals(str2)) System.out.println(String.valueOf(true));
       else System.out.println(String.valueOf(false));
    }
}
