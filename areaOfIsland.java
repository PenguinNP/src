import java.util.Scanner;

class Solution{
	int[][] grid;
	boolean[][] seen;
	int maxAreaOfIsland(int[][] grid){
		this.grid=grid;
		seen = new boolean[grid.length][grid[0].length];
		int ans=0;
		for (int i=0;i<grid.length;i++){
			for (int j=0;j<grid[0].length;j++){
				ans= Math.max(ans,area(i,j));

			}
		}
	return ans;
	}
	int area (int i,int j){
		if (i<0||i>= grid.length||j<0||j>= grid[0].length||seen[i][j]||grid[i][j]==0)
			return 0;
	seen[i][j]=true;
	return (1+area(i+1,j)+area(i-1,j)+area(i,j-1)+area(i,j+1));
	}

}
public class areaOfIsland {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution p = new Solution();
		int[][] a = new int[4][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println(p.maxAreaOfIsland(a));
	}
}
