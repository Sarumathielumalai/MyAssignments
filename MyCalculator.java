package week1.day1;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		
		System.out.println(obj.add(20, 30, 60));
		System.out.println(obj.sub(40,20));
		System.out.println(obj.divide(50f,5f));
		System.out.println(obj.mul(2,3));

	}

}
