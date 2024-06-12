package test;

public class MyDemo {

	public static void main(String[] args) {
		System.out.println("Hello GIT!!!");
		System.out.println(callMe());
		touchMe();
		
		//*** Create GetInfo instance and call getInfo() method
		GetInfo info = new GetInfo();
		System.out.println(info.getInfo("Alex"));
		int a = 5;
		int b = 8;
		System.out.println(info.getIntegerSum(a, b));
		
	}
	
	public static String callMe() {
		return "Congratulation!";
	}
	
	public static void touchMe() {
		System.out.println("Don't touch");
	}


}
