class wordlength{
	 public int length (String word){
		int len=0;
		 boolean space = false;
		for(int i = (word.length()-1);i>-1;i--){

				if (Character.isLetter(word.charAt(i))){
				 len++;
				 space = true;
				}
				else {
					if (space==true){
						return len;
					}
				}
		}
		return  len;

	}

}
public class lastwordlength {
	public static void main(String[] args) {
		wordlength a = new wordlength();
		String sentence ="day";
		System.out.println(a.length(sentence));

	}
}
