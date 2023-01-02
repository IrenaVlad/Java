import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Seminar4 {
    static ArrayList<String> list_fname = new ArrayList<>();
    static ArrayList<String> list_lname = new ArrayList<>();
    static ArrayList<String> list_tname = new ArrayList<>();
    static ArrayList<Integer> list_age = new ArrayList<>();
    static ArrayList<Boolean> list_sex = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();

    public static void main(String[] args) {

        putTo("Ivanov Ivan Ivanovich", 16, "M");
        putTo("Ivanov Fedr Ivanovich", 16, "M");
        putTo("Ivanov Strepan Ivanovich", 51, "M");
        putTo("Ivanova Olga Ivanovna", 34, "F");
        putTo("Ivanova Anna Ivanovna", 16, "F");
        putTo("Ivanova Sveta Ivanovich", 34, "F");
        putTo("Ivanov Stepan Ivanovich", 34, "M");

        int cnt = linkedlist.size()-1;
        while (cnt > -1) {
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (max_age < list_age.get(linkedlist.get(i))){
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);
            cnt--;
        }

        linkedlist.forEach(i -> System.out.println(list_fname.get(i)+" " +list_lname.get(i).toUpperCase().charAt(0)+"."+list_tname.get(i)+list_age.get(i)+list_sex.get(i)));
    }

    static void putTo(String fio, int age, String gender){
        list_age.add(age);
        String[] fio1 = fio.split(" ");
        list_fname.add(fio1[1]);
        list_lname.add(fio1[0]);
        list_tname.add(fio1[2]);
        if (gender.contains("F")) {list_sex.add(true);} else  {list_sex.add(false);}
        linkedlist.add(list_age.size() - 1);
    }
}


