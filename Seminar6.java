import java.util.*;

public class Seminar6 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("red");
        set.add("green");
        set.add("blue");
        set.add("white");
        set.add("black");
        System.out.println("HashSet:" + set);

        Iterator<String> itset = set.iterator();
        ArrayList<String> arrList = new ArrayList<>();
        while (itset.hasNext()){
            arrList.add(itset.next());
        }
        Collections.sort(arrList);

        Set<String> linked = new LinkedHashSet<>();
        linked.addAll(arrList);
        System.out.println("LinkedHashSet: " +linked);

        Set<String> tree = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) { return 0;}
                if (o1.compareTo(o2)>0) {return 1;}
                else return -1;
            }
        });
        Set<String> tree2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) { return 0;}
                if (o1.compareTo(o2)>0) {return -1;}
                else return 1;
            }
        });

        tree.addAll(set);
        System.out.println("TreeSet:" +tree);
        tree2.addAll(set);
        System.out.println("TreeSet reverse:" +tree2);
    }
}