public class PositionOfNumberInArray {
	public static void main(String[] args) {
		int arr[]={1,2,3,3,4,5,2};

		for (int i : pos(arr,2)){
			System.out.println(i);

		}

	}


	public static int[] pos(int[] arr, int num) {
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				a = a + 1;

			}

		}
		if (a==0){
			int[] k ={-1,-1};
			return k;
		}
		else{
			int[] ret = new int[a];
				int c=0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == num) {
					ret[c] = i + 1;
					c+=1;
				}

			}
			return ret;
		}



	}
}