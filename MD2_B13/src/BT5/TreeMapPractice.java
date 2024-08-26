package BT5;

import java.util.Random;
import java.util.TreeMap;
import java.util.Comparator;

public class TreeMapPractice {
    public static void main(String[] args) {
        // Khai báo n là số phần tử của mảng
        int n = 10;
        int[] array = new int[n];

        // Sử dụng đối tượng của lớp Random để sinh ra các phần tử ngẫu nhiên cho mảng
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100); // Sinh số ngẫu nhiên từ 0 đến 99
        }

        // Hiển thị các phần tử của mảng ra màn hình
        System.out.println("Các phần tử của mảng:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Khai báo một đối tượng TreeMap (map1) để lưu trữ các phần tử
        TreeMap<Integer, Integer> map1 = new TreeMap<>();

        // Đưa các phần tử của mảng vào TreeMap
        for (int num : array) {
            map1.put(num, 0);
        }

        // Lấy giá trị của phần tử nhỏ nhất trong TreeMap bằng firstKey()
        int minValue = map1.firstKey();
        System.out.println("Phần tử nhỏ nhất trong mảng: " + minValue);

        // Khai báo một TreeMap khác (map2) sắp xếp các khóa theo thứ tự giảm dần
        TreeMap<Integer, Integer> map2 = new TreeMap<>(Comparator.reverseOrder());

        // Truyền các giá trị của map1 vào map2
        map2.putAll(map1);

        // Xóa phần tử lớn nhất khỏi map2 và lấy phần tử lớn thứ 2
        map2.remove(map2.firstKey());
        int secondLargestValue = map2.firstKey();
        System.out.println("Phần tử lớn thứ 2 trong mảng: " + secondLargestValue);
    }
}
