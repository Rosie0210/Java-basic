package BT2;

import java.util.Scanner;

public class Fibonacci {

    private static int fibonacci(int k) {

        if(k<0) {
            return -1;
        }else if((k==0)||(k==1)) {
            return k;
        }else {
            return fibonacci(k - 1) + fibonacci(k - 2);
        }
    }





    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n;
        System.out.println("Nhap n: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(n+ " số đầu tiên trong dãy Fibonacci:");
        for(int i=0; i<n; i++) {
            System.out.print(String.valueOf(fibonacci(i))+"\t");
        }
    }

}
