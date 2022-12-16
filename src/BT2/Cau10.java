package BT2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Cau10 {
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap vao ho ten ( ho-ho dem -ten) : ");
        String strInput= input.nextLine();
        System.out.println("Ho va ten duoc sap xep lai (ten- ho - ho dem) :"+doiViTri(strInput));
    }


    public static String doiViTri(String str){
        StringTokenizer strToken= new StringTokenizer(str," ");
        String ho    = strToken.nextToken();
        String hoDem = strToken.nextToken();
        String ten   = strToken.nextToken();
        String strOutput= ten+" "+ho+" "+hoDem;
        return(strOutput);
    }
}
