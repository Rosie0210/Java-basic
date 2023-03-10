package BT2;
import java.util.Scanner;
public class Cau15 {
    public static void main(String[] args){
        System.out.print("Nhap so hang n=");
        int n= nhap();
        System.out.print("Nhap so cot m=");
        int m= nhap();
        int [][] A= new int[n][m];
        int i,j;
        for(i=0 ; i<n ; i++){
            for(j=0 ; j<m ; j++){
                System.out.println("Nhap phan tu thu A["+(i+1)+"]["+(j+1)+"]= ");
                A[i][j]= nhap();
            }
        }
        //In ra ma tran nhap vao
        System.out.println("Ma tran nhap vao: ");
        inMT(A, n, m);
        //Tim phan tu max
        for(i=0 ; i<n ; i++){
            for(j=0 ; j<m ; j++){
                if(A[i][j]==findMaxMT(A, n, m))System.out.println("\nPhan tu o hang "+i+" cot "+j+" dat Max: A["+i+"]["+j+"]= "+A[i][j]);
            }
        }
        phanTuSNT(A,n,m);
    }
    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }
    private static boolean checkSNT(int n) {
        if(n>1){
            for(int i =2; i<=Math.sqrt(n);i++){
                if(n%i==0)
                    return false;
            }
            return true;
    }
        else return false;
    }
    public static void inMT(int[][] A, int n, int m){
        int i,j;
        for(i=0 ; i<n ; i++){
            System.out.print("\n");
            for(j=0 ; j<m ; j++) System.out.print(" "+A[i][j]);
        }
    }
    public static int findMaxMT(int[][] A, int n, int m){
        int Max= A[0][0];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(Max<A[i][j]) Max= A[i][j];
            }
        }
        return (Max);
}
    public static void phanTuSNT(int[][] A, int n, int m){
        int count=0, i, j;
        System.out.println("\nCac phan tu la SNT: ");
        for(i=0; i < n; i++){
            System.out.print("\n");
            for(j=0;j<m;j++){
                if(checkSNT(A[i][j])){
                    count++;
                    System.out.print(""+A[i][j]);
                }
                else System.out.print(""+0);
            }
        }
        System.out.println("\nCo"+count+" phan tu la SNT");
    }


}
