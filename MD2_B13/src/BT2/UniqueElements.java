package BT2;

import java.util.HashMap;
import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        for (int num : array) {
            if (elementCountMap.containsKey(num)) {
                elementCountMap.put(num, elementCountMap.get(num) + 1);
            } else {
                elementCountMap.put(num, 1);
            }
        }

        ArrayList<Integer> uniqueElements = new ArrayList<>();
        for (int key : elementCountMap.keySet()) {
            if (elementCountMap.get(key) == 1) {
                uniqueElements.add(key);
            }
        }

        System.out.println("Các phần tử duy nhất trong mảng là: " + uniqueElements);
    }
}
