public class Homework2
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("1+2=3");
        for (int i = 0; i < sb.length(); i++) 
            {
            int j = sb.indexOf("=");
            if (j > 0)
               {
                sb.replace(j, j+1, "равно");
               }
            }
        System.out.println(sb);
    }
}
