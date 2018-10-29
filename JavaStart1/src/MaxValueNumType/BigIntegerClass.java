package MaxValueNumType;

import java.math.BigInteger;
import java.util.Arrays;

public class BigIntegerClass {

	public static void main(String[] args) {
		BigInteger i1 = new BigInteger("12364564648787988977788779");
		BigInteger i2 = new BigInteger("456562315646545645646545645646");

		System.out.println(i1.add(i2));
		System.out.println(i1.subtract(i2));
		System.out.println(i2.multiply(i1));
		
		byte[] b = i1.toByteArray();
		System.out.println(Arrays.toString(b));
	
	
	}

}
