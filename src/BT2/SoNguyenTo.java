package BT2;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args){
        int n;
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon so " + n + " la: ");

        for (int i = 2; i < n; i++) {
            if (snt(i)) {
                System.out.print(i + ",");
            }
        }
    }

    public static boolean snt(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
