package work4;

import java.util.Scanner;

public class homework4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int[] D = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

     
        System.out.println("請輸入年份 (yyyy):");
        int I = scanner.nextInt();

        System.out.println("請輸入月份 (mm):");
        int J = scanner.nextInt();

        System.out.println("請輸入日期 (dd):");
        int K = scanner.nextInt();

      
        if (J < 1 || J > 12) {
            System.out.println("輸入的月份不合法！");
            return;
        }

     
        boolean L = (I % 4 == 0 && I % 100 != 0) || (I % 400 == 0);
        if (L) {
            D[1] = 29; 
        }

      
        if (K < 1 || K > D[J - 1]) {
            System.out.println("輸入的日期不合法！");
            return;
        }

     
        int N = 0;
        for (int M = 0; M < J - 1; M++) {
            N += D[M];
        }
        N += K;

     
        System.out.println("輸入的日期為該年第" + N + "天");

        scanner.close();
    }
}
