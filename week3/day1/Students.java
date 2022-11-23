package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
        System.out.println(id);
	}
	public void getStudentInfo(String name, int id) {
		// TODO Auto-generated method stub
        System.out.println(name);
        System.out.println(id);
	}
	public void getStudentInfo(long phnumber, String email) {
		// TODO Auto-generated method stub
        System.out.println(phnumber);
        System.out.println(email);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Students st=new Students();
         st.getStudentInfo(1072);
         st.getStudentInfo("Saru", 1072);
         st.getStudentInfo(123456789L, "saru@gmail.com");
	}

}
