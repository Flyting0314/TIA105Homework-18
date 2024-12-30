package work4;

public class homework4_6 {
    public static void main(String[] args) {
        
        int[][] D = {
            {10, 35, 40, 100, 90, 85, 75, 70},
            {37, 75, 77, 89, 64, 75, 70, 95},
            {100, 100, 79, 90, 90, 75, 79, 90},
            {77, 95, 89, 60, 75, 85, 85, 89},
            {98, 70, 89, 90, 75, 90, 89, 90},
            {90, 80, 100, 75, 50, 20, 99, 75}
        };

       
        int[] K = new int[8]; 

      
        for (int I = 0; I < 8; I++) { 
            int maxScore = 0; 

           
            for (int J = 0; J < 6; J++) { 
                if (D[J][I] > maxScore) {
                    maxScore = D[J][I]; 
                }
            }

          
            for (int J = 0; J < 6; J++) {
                if (D[J][I] == maxScore) {
                    K[I]++; 
                }
            }
        }

     
        for (int I = 0; I < 8; I++) {
            System.out.println("第" + (I + 1) + "號同學的最高分出現了" + K[I] + "次");
        }
    }
}
