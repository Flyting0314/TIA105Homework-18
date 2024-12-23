//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
package work1;

public class pi {
    public static void main(String[] args) {
        double i = 3.1415;
        int j = 5;
        System.out.println("圓面積: " + (i * j * j));
        System.out.println("圓周長: " + (2 * i * j));
    }
}