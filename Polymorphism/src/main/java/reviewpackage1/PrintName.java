package reviewpackage1;

public class PrintName {
	
	public static String display() {
		String name="Anu";
		return name;
	}

	public static void main(String[] args) {
		String name=PrintName.display();
		System.out.println("The name is "+name);
	}
}
