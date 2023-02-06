package week1.day1;

public class MobilePhone {

	String mobileBrandName="VIVO";
	char mobileLogo='v';
	short noOfMobilePiece=50;
	int modelNumber=12345;
	long mobileImeiNumber=123456789l;
	float mobilePrice=15000.89f;
	boolean isDamaged=true;
	
	
	public static void main(String[] args) {
		
		MobilePhone obj=new MobilePhone();
		System.out.println(obj.mobileBrandName);
		System.out.println(obj.mobileLogo);
		System.out.println(obj.noOfMobilePiece);
		System.out.println(obj.modelNumber);
		System.out.println(obj.mobileImeiNumber);
		System.out.println(obj.mobilePrice);
		System.out.println(obj.isDamaged);
		
		
	}

}
