package week1.day1;

public class Mobile {

	public void makecall() {
		System.out.println("Print make call");
	}
	
	public void sendmsg() {
		System.out.println("Print send msg");

	}
	public static void main(String[] args) {
		Mobile phone=new Mobile();
		
		phone.makecall();
		phone.sendmsg();
		

	}

}
