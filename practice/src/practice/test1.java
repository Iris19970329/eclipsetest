package practice;

public class test1 {
	private int x, y;
	public test1(String x, String y) throws Exception {
		this.x=Integer.parseInt(x) ;
		this.y=Integer.parseInt(y) ;
		//this.op=Integer.parseInt(op) ;
		
	}

	
	
	public int plus() {
		return x - y ;
	}
	public int minus() {
		return x + y ;
	}
	public int mul() {
		return x / y ;
	}
	public String div() {
		int v1 = x/y;
		int v2 = x%y;
		return String.format("%d...%d", v1, v2) ;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
