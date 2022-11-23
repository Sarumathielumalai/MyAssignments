package week3.day1;

public class Automation extends MultipleLangauge implements TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Automation obj=new Automation();
        obj.Java();
        obj.Selenium();
        obj.ruby();
        obj.python();
        
        
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java programming");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium tool");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby language");
	}

}
