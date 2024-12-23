package work3;

import java.util.Scanner;

public class triangle {

public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("請輸入三個字來檢查是否為三角形");
	 
	 int[] sides = new int[3];
	 
	 for(int i = 0; i < 3 ; i++) {
		 System.out.print("請輸入第"+( i + 1 )+"個數字");
		sides[i] = sc.nextInt();
	 }
	 
	 int a = sides[0];
     int b = sides[1];
     int c = sides[2];
     
     if(a + b > c && a + c > b && b + c > a) {
       if(a == b && b == c) {
    	 System.out.println("正三角形");
       } else if(a == b || b == c || a == c) {
         System.out.println("等腰三角形");
       } else if(a * a + b * b == c * c){
         System.out.println("直角三角形");
       }else {
    	 System.out.println("其他三角形");
        }
       }else {
	     System.out.println("不是三角形");
     }
     sc.close();
 }
}
	     
	   

