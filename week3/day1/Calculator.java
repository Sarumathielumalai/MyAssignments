package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);

	}
	public void sub(double a, double b) {
		System.out.println(a-b);

	}
	public void sub(int a,int b) {
		System.out.println(a-b);

	}
	public void mul(int a, double b) {
		System.out.println(a*b);

	}
	public void mul(double a, double b) {
		System.out.println(a*b);

	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(2,3);
		obj.add(2,3,4);
		obj.sub(40, 20);
		obj.sub(4, 2);
		obj.mul(2, 40);
        obj.mul(20, 40);
	}

}
