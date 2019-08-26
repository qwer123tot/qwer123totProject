package p0826;

public class SimpleCalClass {

	private int res = 0;
	
	public int add(int x, int y) {
		return x+y;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public void inc(int d) {
		res +=d;
	}
	public void des(int d) {
		res -=d;
	}
	
	public int getResult() {
		return res;
	}

}
