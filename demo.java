public class demo {
	public static void main(String[] args) {
		String arratstr = "Here you can enter the string to count the char at a sentence";
		char c[] = arratstr.toCharArray();
		int[] countarr = new int[(int)Character.MAX_VALUE];

		for (int i =0;i<c.length;i++){
			countarr[(int)c[i]]++;
			System.out.println(countarr[(int)c[i]]++);
		}
		for (int i =0 ;i<countarr.length;i++){
			System.out.println(i);
			if (countarr[i]!=0){
				System.out.println((char)i+" - > "+countarr[i]);
			}

		}
	}
}
