//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
package work1;

public class EggCalculator {
    public static void main(String[] args) {
        int i = 200; 
        int j = i / 12; 
        int t = i % 12; 

        System.out.println(j + " 打");
        System.out.println(t + " 顆");
    }
}
