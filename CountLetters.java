public class CountLetters {
	public static void main(String[] args) {
		String arratstr = "Here you can enter the string to count the char at a sentence";
		char[] c = arratstr.toCharArray();//it converts the given string into an
		// array of character and here c[3]=e and c[5]=y
		int[] countarr = new int[(int)Character.MAX_VALUE];//it makes an array of the max value of character in UFT-8
		// which is a square like block and its value is 65535
		// we can write it as int [] countarr = new int[65535]
		for (int i =0;i<c.length;i++){
			countarr[(int)c[i]]++;
		}
		for (int i =0 ;i<countarr.length;i++){
			if (countarr[i]!=0){
				System.out.println((char)i+" - > "+countarr[i]);
			}

		}
	}
}
