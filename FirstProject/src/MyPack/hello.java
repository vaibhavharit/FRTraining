package MyPack;

public class hello {

	public static void main(String[] args) {
		System.out.println("Helloooo");
		hello h1 = new hello();
		h1.add();
	}

	// Private / Public / Protected Inner classes allowed
	private class InnerPrivate {
		// Only non-static methods allowed for non-static inner class
	}

	static {
		System.out.println("static block executed even before main");
	}

	public static void add() {
		System.out.println("sum is " + 4);
	}

}

//Only default outer class allowed
class OuterClass {

}
