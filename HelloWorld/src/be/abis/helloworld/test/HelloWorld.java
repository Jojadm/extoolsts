package be.abis.helloworld.test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length==0) {
			System.out.println("Hello World");
		} else {
			System.out.println("Hello " +args[0]);
		}
	}
}

