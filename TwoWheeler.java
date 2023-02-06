package week1.day1;

public class TwoWheeler {
    
	int noOfWheels = 2;
	short noOfMirrors=10;
	long chasisNumber=4523541256L;
	boolean isPunctured=true;
	String bikeName="Honda";
	double runningKM=174.47;
	
	public static void main(String[] args) {
		TwoWheeler obj=new TwoWheeler();
		
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chasisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.out.println(obj.runningKM);

	}
	}

