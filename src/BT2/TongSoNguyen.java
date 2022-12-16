package BT2;

import java.util.Scanner;

public class TongSoNguyen {

    public static void main(String[] args){
        int so, tong = 0;
        System.out.println("Nhap so nguyen: ");
        Scanner sc = new Scanner(System.in);
        so = sc.nextInt();
        while (so > 0) {
            tong = tong + so % 10;
            so = so / 10;
        }
        System.out.println("Tong cac so la: " + tong);
    }
}
