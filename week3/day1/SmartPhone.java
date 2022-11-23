package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsapp() {
		System.out.println("Connect to whatsapp");

	}
	public static void main(String[] args) {
		SmartPhone phone=new SmartPhone();
		
		phone.sendMsg();
		phone.makeCall();
		phone.saveContact();
		phone.takeVideo();
		phone.connectWhatsapp();
		
	}
}
