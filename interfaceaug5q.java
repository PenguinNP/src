
interface num{
	int add(int x,int y);
	int sub(int x,int y);
}
class newClass implements num{
	int x;
	int y;
	public newClass(){

	}
	public newClass(int x,int y){
		this.x=x;
		this.y=y;
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}
}
public class interfaceaug5q {
	public static void main(String[] args) {
		newClass Utshav = new newClass();
		System.out.println(Utshav.add(4,2));
	}
}
