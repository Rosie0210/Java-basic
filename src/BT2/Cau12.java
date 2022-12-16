package BT2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Cau12 {


    /**
     * Chương trình liệt kê số lần xuất hiện các phần tử trong một mảng
     * nhập từ bàn phím trong java.
     *
     */

        public static Scanner scanner = new Scanner(System.in);

        /**
         * main
         *
         * @param args
         */
        public static void main(String[] args) {
            System.out.print("Nhập số phần tử của mảng: ");
            int n = scanner.nextInt();
            // khởi tạo arr
            int [] arr = new int [n];
            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < n; i++) {
                System.out.printf("a[%d] = ", i);
                arr[i] = scanner.nextInt();
            }
            // tìm số lần xuất hiện của các phần tử
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                addElement(map, arr[i]);
            }
            System.out.print("Các phần tử xuất hiện 2 lần: ");
            for (Integer key : map.keySet()) {
                if (map.get(key) == 2) {
                    System.out.print(key + " ");
                }
            }
        }

        /**
         * Thêm từ vào map
         *
         * @param /wordMap: map chứa các từ và số lần xuất hiện
         * @param /sb: từ cần thêm vào wordMap
         */
        public static void addElement(Map<Integer, Integer> map, int element) {
            if (map.containsKey(element)) {
                int count = map.get(element) + 1;
                map.put(element, count);
            } else {
                map.put(element, 1);
            }
        }

}
