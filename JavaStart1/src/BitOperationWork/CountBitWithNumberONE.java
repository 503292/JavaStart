package BitOperationWork;

public class CountBitWithNumberONE {

	public static void main(String[] args) {
		int n = 117;
		int count = 0;
		
		while(n != 0 ) {
			if(n % 2 > 0) {
				count++;
			}
			n = n / 2;
		}
		System.out.println(count);

	}

}
