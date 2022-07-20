import java.util.Scanner;
// remove of intenger
class intarr{
	  int arr(int[] arry,int a){
		  int j =0;
			for (int i=0;i< arry.length;i++){
				if (arry[i]!=a){
					arry[j]=arry[i];
					j++;
				}
			}
				return j;
	}

}
public class removeIntArr {
	public static void main(String[] args) {
		intarr a = new intarr();
		Scanner sc = new Scanner(System.in);
		int[] k= new int[6];
		for(int i = 0;i<k.length;i++){
			k[i] = sc.nextInt();
		}
		a.arr(k,3);
	}
}
