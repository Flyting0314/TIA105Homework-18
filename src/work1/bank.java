//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)
package work1;

public class bank {
    public static void main(String[] args) {
        double i = 1500000; 
        double j = 0.02;    
        int t = 10;         

        double a = i * Math.pow(1 + j, t); 

        System.out.println((int)a); 
    }
}

 