package BT2;

import java.util.Scanner;

public class Cau8 {
    public static void main(String[] args){
        String text;
        System.out.println("Nhap van ban: ");
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        System.out.println(DemChu(text));
    }

    public static int DemChu(String text) {
        String[] words = text.split("");
        return words.length;
    }

}
