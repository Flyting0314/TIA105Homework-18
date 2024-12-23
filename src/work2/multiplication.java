package work2;
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
public class multiplication {
	public static void main(String[] args) {
		 
		int i = 1;
		for(int j =1; j<=10 ; j++) {
		
        i *= j;
    }

    System.out.println(i);
	}
}