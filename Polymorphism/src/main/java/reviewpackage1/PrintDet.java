package reviewpackage1;

public class PrintDet {
	String name;
	int rollNo;
	
	public PrintDet(String n, int r) {
		name=n;
		rollNo=r;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("rollNo: "+rollNo);
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		PrintDet p1=new PrintDet("Anu",1);
		PrintDet p2=new PrintDet("Arjun",2);
		
		p1.display();
		p2.display();

	}

}
