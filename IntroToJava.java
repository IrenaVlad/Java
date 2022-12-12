public class Lesson1 {
    public static void main(String[] args) {
        int a = 6;
        double d = 5;
        float f = 4.2;
        long l = 34;
        short s = 2;
        byte b = 12;
        boolean bool = true;

        char ch = 'g';
        ch = 12;

        int[] ints = new int[10];
        ints[4] = ints[1] = 6;

        if(a <= 9) a = 2; else if (a>10) a = 10; else a = 0;

        int ap = 0;
        for (int i = 0; o = 8; i<o; i++; ap+=i) {}

        Random random = new Random();
        //random.setSeed(10289); #vidaet odinakovie chisla

        for (int i=0; i<ints.length; i++) {
            ints[i] = random.nextInt(bound: 1024); //new Random().nextInt(bound: 1024)
        }

        for (int i: ints) {
            System.out.println(i);
        }

        String str = "Hello + World!";
        String str2 = new String("Ivanov ivan inanich");
        str+= "Chenibud";

        System.out.println(str(.toLowerCase())); //vse bukvi strochnie - sozdaet novyu str i vidaet
        str = str.toLowerCase(); 
        if (str.equals("Hello")) System.out.println(String.value0f(b: true)); //сравнивает содержание строк а не их тип, возвращает правда или ложь 
        else System.out.println(String.value0f(b: false));

        str.charAt(str.length()/2); //вернет буквы в середине строки, вводим индекс

        str.replace("+", "plus"); //заменить знак на слово
        System.out.println(str.replace("+", "plus"));
        System.out.println("Hello".repeat(5)); //повторить строку 5 раз
        str.concat(str).contains("!He"); //повторить строку 2 раза, склеить, найти фрагмент!Не
        String[] temp = str2.split(" "); //разбить строку на слова пробелом
        System.out.println(tmp[]+" "+tmt[1].toUpperCase().charAt(0)+"."+tmt[2].toUpperCase().charAt(0)+"."); //Ivanov I.I.
        srt.trim(); // obrezat probeli
        str.subSequence(2, 5); //вырезать буквы с 2 по 5 индексы
        str.substring(str.length()/2); // вырезает с середины строки и до конца
        str.strip();

        StringBulder sb = new StringBulder(); //массив нефинализированный
        sb.append("123"); // добавить что то в конец
        sb.reverse(); // перевернуть
        sb.deleteCharAt(); //удалить букву по опред индексу
        sb.insert(1, "twet"); //вставить что то


        int[] ints1 = {1, 5, 7};

        Arrays.fill(ints, new.Random().nextInt()); //заполнить массив одним случайным числом
        int[] ints2 = Arrays.copyOf(ints, ints.length); //создает новый массив
        int[] ints3 = ints2; //ссылка на другой массив
        Arrays.sort(ints1);
        System.out.println(Arrays.toString(inst1));


    }
}
