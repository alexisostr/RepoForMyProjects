package test;

public class MyDemo {

	public static void main(String[] args) {
		System.out.println("Hello GIT!!!");
		System.out.println(callMe());
		touchMe();
		
	}
	
	public static String callMe() {
		return "Congratulation!";
	}
	
	public static void touchMe() {
		System.out.println("Don't touch");
	}


}
