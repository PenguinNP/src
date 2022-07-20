class Sol {
	public int minMaxGame(int [] nums) {
		int n = nums.length;
		if (n==1)
			return nums[0];
		int[] newnum = new int[n/2];
		for(int i=0;i< n/2;i++){
			if (i%2==0){
				newnum[i]=Math.min(nums[2*i],nums[2*i+1]);
			}
			else {
				newnum[i]=Math.max(nums[2*i],nums[2*i+1]);
			}
			System.out.println(newnum[i]);
		}
		int ans = minMaxGame(newnum);
		return ans;
	}
}
public class MinMaxGame {
	public static void main(String[] args) {
		Sol p = new Sol();
		int[] nums = new int[]{1,3,5,2,4,8,2,2};
		System.out.println(p.minMaxGame(nums));

	}
}
