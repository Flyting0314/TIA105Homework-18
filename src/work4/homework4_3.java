package work4;

public class homework4_3 {

	public static void main(String[] args) {
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		String vowels = "aeiou";
		int k = 0;
		
		for(String i :planets) {
			for(char j :i.toCharArray()) {
			      if (vowels.indexOf(j) != -1) {
				k++;
				
			      }
			}
		}
				 System.out.println("母音總數: " + k);
	}
}

