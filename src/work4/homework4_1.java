package work4;

public class homework4_1 {

	public static void main(String[] args) {
		int[] j = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};

		int k = 0;
		for(int i : j) {
			k +=i;
		}
		double m =(double)k /j.length;
		
		System.out.println("平均值:" + m);
		
		System.out.println("大於平均值元素:");
		for(int i : j ) {
			if(i >m) {
				
				System.out.println(i);
				
				
			}
		}
	}

}
