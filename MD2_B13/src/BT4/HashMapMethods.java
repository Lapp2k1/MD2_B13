package BT4;

import java.util.HashMap;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Apple", 50);
        originalMap.put("Banana", 10);
        originalMap.put("Orange", 20);
        originalMap.put("Mango", 40);
        originalMap.put("Grapes", 30);

        HashMap<String, Integer> copiedMap = new HashMap<>();
        copiedMap.putAll(originalMap);

        System.out.println("HashMap đã sao chép:");
        for (String key : copiedMap.keySet()) {
            System.out.println(key + " = " + copiedMap.get(key));
        }

        String keyToCheck = "Mango";
        if (copiedMap.containsKey(keyToCheck)) {
            System.out.println("\nPhần tử \"" + keyToCheck + "\" tồn tại trong HashMap.");
        } else {
            System.out.println("\nPhần tử \"" + keyToCheck + "\" không tồn tại trong HashMap.");
        }
    }
}

