package BT2;

import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        n1 = (int)scanner.nextInt();
        System.out.print("Nhập số thứ hai:");
        n2 = (int)scanner.nextInt();
        scanner.close();
        while (n1 != n2) {
            if(n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }
        System.out.printf("Ước chung lớn nhất là: %d", n2);
    }
}
