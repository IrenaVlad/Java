import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework5 {
    public static void main(String[] args) {
        HashMap<Integer, String> fio = new HashMap<>();
        final String Print = "%s. %s%n";

        fio.put(0, "Иванов Иван Иванович 45 м");
        fio.put(1, "Петров Петр Петрович 15 м");
        fio.put(2, "Сидоров Сидор Сидорович 35 м");
        fio.put(3, "Иванова Анна Петровна 27 ж");
        fio.put(4, "Карпова Луиза Андреевна 15 ж");

        System.out.println("Коллекция с изменённым значением пол:");
         fio.replaceAll(
                 (k, v) -> v.substring(0, v.length() - 1) + String.valueOf(v.charAt(v.length()-1)).toUpperCase()
         );
         fio.forEach((k, v) -> System.out.printf(Print, k, v));
         System.out.println();

         System.out.println("Коллекция с измененными значениями инициалов:");
         fio.values().forEach(person -> {
             String[] s = person.split(" ");
             System.out.printf("%s %s.%s.%n", s[0], s[1].toUpperCase().charAt(0), s[2].toUpperCase().charAt(0));
         });


    }
}