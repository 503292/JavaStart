package TypeWork;

public class TypeSize {

	public static void main(String[] args) {
		
		byte[] a1 = {1,2,3};
		int[] a2 = {1,2,3,4};
		
		System.out.println(sizeType(a1) + ", " + sizeType(a2));

	}
	
	public static int sizeType(byte[] a) {
		return a.length;
	}
	
	public static int sizeType(int[] a) {
		return a.length*4;
	}

}
