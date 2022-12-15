public class Homework2
{
    public static String reverse(String str)
    {
        if (str == null || str.equals("")) {
            return str;
        }
 
        return reverse(str.substring(1)) + str.charAt(0);
    }
 
    public static void main(String[] args) 
    {
        String str = "Hello";
 
        str = reverse(str);
 
        System.out.println(str);
    }
}