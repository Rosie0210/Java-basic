package BT2;

import java.util.Scanner;

import static BT2.SoNguyenTo.snt;

public class Cau7 {
    public static void main(String[] args){
        int n;
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ThuaSo(n);
        Tongso(n);
    };

    public  static void Tongso(int n){
        int tong=0;
        while (n > 0) {
            tong = tong + n % 10;
            n = n / 10;
        }
        System.out.println("Tong cac so la: " + tong);
    }

    public static void ThuaSo(int n) {
        for (int i = 2; i <= n; i++) {
            if (snt(i)) {
                if (n % i == 0) {
                    System.out.println("Thua so cua " + n + " la: " + i + "." + n / i);
                    break;
                }
            }
        }
    }
}
