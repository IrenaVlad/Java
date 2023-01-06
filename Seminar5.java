import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sem5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "Zero"); //записать значение
        map.put(1, "one");
        map.put(2, "two");

        //map.forEach(k, v) -> System.out.println(k+"="+v); //вывести ключ-значение

        String tmp = map.get(1);
        tmp = map.getOrDefault(1, "default");

        Set<Integer> kset4 = map.keySet(); //получить список ключей
        Set<Map.Entry<Integer, String>> eset = map.entrySet(); //вытащить все из мапа
        map.remove(1); //удалить по ключу
        if (map.containsKey(1)) map.remove(1);//contains - true/false
        if (map.containsValue("One")) map.remove("One");

        map.size();//сколько пар ключ-значение
        map.isEmpty();// true/false

        map.putIfAbsent(1, "One");//если нет такого ключа, то положить значение
        map.replace(1, "NewOne"); // перезаписать значение
        
        Collection<String> val = map.values(); //возвращает коллекцию из значений
        map.clear();
        map.compute(1, (k, v) -> v+"!");//разворачивает в цикл
        map.computeIfPresent(1, (k, v) -> v=v.toUpperCase()); //работает, если такой ключ есть
        map.computeIfAbsent(3, v -> getStr()); //сработает если такого ключа нет

        map.merge(4, "newKey", (v1, v2) -> v2); // put if absent
        map.merge(4, "anotherKey", (v1, v2) -> v1+v2); // sum
        map.merge(4, "newKey", (v1, v2) -> null); //=remove

        System.out.println(map);

        Map<Integer, String> map1 = new LinkedHashMap<> (); //по порядку, сортированный hashMap
        Map<Integer, String> map2 = new TreeMap <> (); //имеет внутр иерархию дерева
    }

    private static String getStr()
    {
        return "new String";
    }
}