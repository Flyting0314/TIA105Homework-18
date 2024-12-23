package work2;

public class wen {
    public static void main(String[] args) {
        int i = 0; 

        System.out.println("");
        for (int j = 1; i <= 49; i++) {
          
            if (i / 10 != 4 && i % 10 != 4) { 
                System.out.print(i + " ");   
            }
        }
        System.out.println( i );
    }
}
