import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Homework4 {
    static ArrayList<String> f_name = new ArrayList<>();
    static ArrayList<String> i_name = new ArrayList<>();
    static ArrayList<String> o_name = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<Boolean> gender = new ArrayList<>();
    static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        putTo("Ivanov Ivan Ivanovich", 16, "M");
        putTo("Ivanov Fedr Ivanovich", 15, "M");
        putTo("Ivanova Anna Ivanovna", 25, "F");
        putTo("Ivanov Stepan Ivanovich", 51, "M");
        putTo("Ivanova Ivanka Ivanovna", 35, "F");
        putTo("Ivanov Semen Ivanovich", 21, "M");

        for (int i =0; i <linkedList.size(); i++) 
        {
            if (gender.get(linkedList.get(i))) 
            {
                int tmpI = linkedList.get(i);
                linkedList.remove(i);
                linkedList.add(0, tmpI);
            }
        }
        int cnt = linkedList.size()-1;
        while (cnt > -1)
        {
            int max_age = age.get(linkedList.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++)
            {
                if (max_age < age.get(linkedList.get(i)))
                {
                    max_age = age.get(linkedList.get(i));
                    index = i;
                }
            }
        int tmp = linkedList.get(cnt);
        linkedList.set(cnt, linkedList.get(index));
        linkedList.set(index, cnt);
        cnt--;
        }
        gender.retainAll(linkedList);
        age.removeAll(linkedList);

        linkedList.forEach(i -> System.out.println(f_name.get(i)+i_name.get(i)+o_name.get(i)+age.get(i)+gender.get(i)));
    }
    static void putTo(String fio, int ages, String gend)
    {
        age.get(ages);
        String[] fio1 = fio.split(" ");
        f_name.add(fio1[1]);
        i_name.add(fio1[0]);
        o_name.add(fio1[2]);
        if (gend.contains("F"))
        {
            gender.add(true);
        }
        else 
        {
            gender.add(false);
        }
        linkedList.add(age.size()-1);
    }

}