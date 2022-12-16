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
        System.out.println("10 số đầu tiên trong dãy Fibonacci:");
        for(int i=0; i<6; i++) {
            System.out.print(String.valueOf(fibonacci(i))+"\t");
        }
    }

}
