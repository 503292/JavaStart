package ArrWork;

public class ArrToString {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4};
		
		System.out.println(toString(a1));

	}
	
	static String toString(int[] a) {
		StringBuilder sb = new StringBuilder("[");
		
		for (int i = 0; i < a.length; i++) {
			if(i < a.length - 1) {
				sb.append(a[i]).append(", ");
			}else {
				sb.append(a[i]);
			}
		}
		return sb.append("]").toString();
	}

}
