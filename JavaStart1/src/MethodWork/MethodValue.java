package MethodWork;

public class MethodValue {

	public static void main(String[] args) { 

		System.out.println( addVal("���� ������� ") + addVal(28.25) + " �� " + addVal(1));
	}

	static String addVal(String s) {
		return s;
	}

	static int addVal(int x) {
		return x;
	}

	static double addVal(double d) {
		return d;
	}

}
