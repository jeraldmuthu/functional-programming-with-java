package inheritance;

abstract class A {

	A() {
		
	}
	protected void m1(){
		System.out.println("Super class m1 method..");
	}
	void m3() {
		System.out.println("Super class m3 method..");
	}
	public static void main(String args[]) {
		B  a =new B();
		
	}
}



class B extends A {

	public void m1() {
		System.out.println("Sub class m1 method..");
	}
	
	void m2() {
		System.out.println("Sub class m2 method..");
	}
}
