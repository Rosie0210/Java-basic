package BT2;

import java.util.Scanner;

import static BT2.SoNguyenTo.snt;

public class Cau6 {
    public static void main(String[] args){
        int n;
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Cac uoc cua " + n + " la: ");
        Uoc(n);
        System.out.println("");
        System.out.println("Cac uoc la so nguyen to: ");
        UocNt(n);

    }

    public static void Uoc(int n) {
        int dem = 0;
        if (n == 1) {
            dem = 1;
            System.out.println("1");
        } else if (n >= 2) {
            System.out.print("1");
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    dem = dem + 1;
                    System.out.print("," + i);
                }
            }
        }
    }

    public static void UocNt(int n) {
        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                if ((n % i == 0) && snt(i)) {
                    System.out.print(i + ",");
                }
            }
        }
    }
}
