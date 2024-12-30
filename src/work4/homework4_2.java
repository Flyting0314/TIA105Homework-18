package work4;

public class homework4_2 {
	 public static void main(String[] args) {
	   String s = "Hello world";
	   
	   char[] charArray = s.toCharArray();
	   
	   for (int i = 0, k = charArray.length - 1; i < k; i++, k--) {
		   char temp = charArray[i];
		   charArray[i] = charArray[k];
		   charArray[k] = temp;
	   }
	   String l = new String(charArray);
	   
	   System.out.println("字串" + l );

	}

}
