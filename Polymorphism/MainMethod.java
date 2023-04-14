public class MainMethod {

	public static void main(String a ,String b) {
		System.out.println("Hello main method");
	}
	public static void main(String name) {
		System.out.println("Hello "+name+ "This is overlod main method");
	}
public static void main(String[] args){
	
	MainMethod.main("a","b");
	MainMethod.main("manasi");
}
}