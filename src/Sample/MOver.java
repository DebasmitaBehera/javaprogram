package Sample;

public class MOver {
	public void add() {
		System.out.println("addition");
		
	}
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		MOver s=new MOver();
		s.add();
		s.add(10, 20);
		s.add(10, 20,30);

	}

}
