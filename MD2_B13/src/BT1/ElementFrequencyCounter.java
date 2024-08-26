package BT1;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequencyCounter {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 2, 1, 5, 1, 3, 5, 1, 2, 4, 5};


        HashMap<Integer, Integer> frequencyMap = new HashMap<>();


        for (Integer num : arr) {
            if (frequencyMap.containsKey(num)) {

                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {

                frequencyMap.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Phần tử " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
        }
    }
}
