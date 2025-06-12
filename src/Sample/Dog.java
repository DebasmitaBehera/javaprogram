package Sample;

public class Dog {
	public void name(String name) {
		System.out.println("Labrodar");
	}
	
	public class Animal extends Dog{
		@Override
		public void name(String name) {
			System.out.println("gsd");
		}
		
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.name("labr");
		d.name("gsd");
		

	}

}
