package BT3;

import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 50);
        hashMap.put("Banana", 10);
        hashMap.put("Orange", 20);
        hashMap.put("Mango", 40);
        hashMap.put("Grapes", 30);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        System.out.println("Các phần tử trong HashMap sau khi sắp xếp theo giá trị tăng dần:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
