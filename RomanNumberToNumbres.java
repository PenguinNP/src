import java.util.Scanner;

 class Killer {
	 int  num (char a){
		if (a =='I'){ return 1; }
		else if (a=='V'){ return 5; }
		else if (a=='X'){ return 10;}
		else if (a=='L') { return 50;}
		else if (a=='C') { return 100;}
		else if (a=='D'){return 500;}
		else if (a=='M'){return 1000;}
		else{ return 0;}
	}
	public int retNumb(String romNum){
		int a = romNum.length();
		int decNum=0;
		int curr,next;
		for (int i=0;i<a;i++){
			try {
				curr = num(romNum.charAt(i));//taking the value of first character or i=2
				if (i!=a-1) {
					next = num(romNum.charAt(i + 1));
					if (next > curr) {//check second and first character values
						curr = next - curr;//if true then subtract the value of second character with first character
						i += 1;//this is to jump one loop it carries the loop from i=0 to i=2
					}
				}
						decNum+=curr;//else add the current value with a new inter with value 0 re previous value
				}
				catch (Exception e){
					System.out.println(e.getMessage());
					decNum += 0;
				}
		}
		return  decNum;
	}

}
public class RomanNumberToNumbres {
	public static void main(String[] args) {
		String a = new Scanner(System.in).next();
		Killer c = new Killer();

		System.out.println(c.retNumb(a));

	}
}
