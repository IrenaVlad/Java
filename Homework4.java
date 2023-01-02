import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Homework4 {
    static List<List<String>> mainList = new ArrayList<>();
    final static Integer FIO_INDEX = 0;
    final static Integer AGE_INDEX = 1;
    final static Integer GENDER_INDEX = 2;
    final static String GENDER_MALE = "М";
    final static String GENDER_FEMALE = "Ж";
    final static String PRINT_TEMPLATE = "%s. %s возраст: %s, пол: %s";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            String fio = getFio(sc);
            String age = getAge(sc);
            String gender = getGender(sc);
            List<String> smallList = new ArrayList<>();
            smallList.add(fio);
            smallList.add(age);
            smallList.add(gender);
            mainList.add(smallList);

        } while (!shouldStop(sc));

        System.out.println("Сортировка по ФИО: ");
        sortBySurnameAndPrint();
        System.out.println();

        System.out.println("Сортировка по возрасту: ");
        sortByAgeAndPrint();
        System.out.println();

        System.out.println("Сортировка по полу: ");
        sortByGenderAndPrint();
        System.out.println();
    }

    private static boolean shouldStop(Scanner sc) {
            System.out.println("Введите \"stop\" для окончания ввода данных или любое другое ЗНАЧЕНИЕ для продолжения: ");
            String cont = sc.nextLine();
        return cont.equalsIgnoreCase("stop");
    }

    private static String getGender(Scanner sc) {
        while (true) {
            System.out.println("Введите пол (m/f): ");
            String gender = sc.nextLine();
            if (gender.equalsIgnoreCase(GENDER_MALE) || gender.equalsIgnoreCase(GENDER_FEMALE)) {
                return gender;
            }
            System.out.println("Неверное значение, повторите ввод");
        }
    }

    private static String getAge(Scanner sc) {
        while (true) {
            System.out.println("Введите возраст (0-100): ");
            String age = sc.nextLine();
            try {
                int intAge = Integer.parseInt(age);
                if (intAge < 0 || intAge > 100) {
                    throw new NumberFormatException();
                }
                return age;
            }
            catch (NumberFormatException exception) {
                System.out.println("Неверное значение, повторите ввод");
            }
        }
    }

    private static String getFio(Scanner sc) {
        while (true){
            System.out.println("Введите ФИО: ");
            String fio = sc.nextLine();
            if (fio.length() > 0) {
                return fio;
            }
            System.out.println("Длинна ФИО должна быть больше нуля, повторите ввод");
        }
    }

    static void sortByAgeAndPrint() {
        mainList.sort(new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return Integer.parseInt(o1.get(AGE_INDEX))-Integer.parseInt(o2.get(AGE_INDEX));
            }
        });

        printList();
    }

    static void sortByGenderAndPrint() {
        mainList.sort(new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o1.get(GENDER_INDEX).compareTo(o2.get(GENDER_INDEX));
            }
        });

        printList();
    }

    static void sortBySurnameAndPrint() {
        mainList.sort(new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o1.get(FIO_INDEX).compareTo(o2.get(FIO_INDEX));
            }
        });
        printList();
    }

    static void printList() {
        for (int i = 0; i < mainList.size(); i++) {
            System.out.printf((PRINT_TEMPLATE) + "%n",
                    i + 1,
                    mainList.get(i).get(FIO_INDEX),
                    mainList.get(i).get(AGE_INDEX),
                    mainList.get(i).get(GENDER_INDEX));
        }
    }
}