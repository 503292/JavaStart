package MyPC;

public class MyPC {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(r.availableProcessors());
		// total amount of memory in the Java virtual machine.
		System.out.println(r.totalMemory());

	}

}
