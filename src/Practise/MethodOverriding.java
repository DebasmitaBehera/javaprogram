package Practise;
class Dog{
    public void method1()
    {
        System.out.println("method1");
    }}
class Animal extends Dog{
    @Override
    public void method1(){
        System.out.println("method2");
    }}

public class MethodOverriding {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.method1();
		Animal a=new Animal();
		a.method1();

	}

}
