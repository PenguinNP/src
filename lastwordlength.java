class wordlength{
	 public int length (String word){
		int len=0;
		int space = 0;
		for(int i = (word.length()-1);i>0;i--){

				if (word.charAt(i) == ' ') {
					space += 1;
				} else {
					break;
				}
			}
		 for(int i = (word.length()-(space+1));i>0;i--){

			 if (word.charAt(i) == ' ') {
				 return len;
			 } else {
				 len += 1;
			 }
		 }

		return 0;

	}

}
public class lastwordlength {
	public static void main(String[] args) {
		wordlength a = new wordlength();
		String sentence ="Fly Me To The Moooooon     ";
		System.out.println(a.length(sentence));

	}
}
