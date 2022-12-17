import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("rojo");
        lst.add("azul");
        lst.add("naranja");
        lst.add("blanco");
        lst.add("amarillo");
        lst.add("marron");
        lst.add("morado");
        lst.add("rosa");
        lst.add("verde");
        System.out.println(lst);

        //Task2
        for (int i = 0; i < lst.size(); i++) 
        {
            lst.set(i,lst.get(i)+"!" );
        }
        System.out.println(lst);

        
       // Task3
       lst.add(0, "turquesa!");
       
       //Task4
       System.out.println(lst.get(0));
       
       //Task5
       lst.remove(3);
       lst.add(3, "negro!");
       System.out.println(lst);
       
       //Task6
       lst.remove(2);
       
       //Task7
       System.out.println(lst.indexOf("blanco!"));
       
       //Task8
       ArrayList<String> lst2 = new ArrayList<String>();
       for (int i = 0; i < lst.size()/2; i++) {
           lst2.add(lst.get(i));
       }
       System.out.println(lst2);
       
       //Task9
       lst.retainAll(lst2);
       System.out.println(lst);

       //Task10
       System.out.println(lst);
       Collections.sort(lst);
       System.out.println(lst);
    }
}    