
public class p042Practice {
	public static void main(String args[]) {
		float myarray[][] = {
			{ -56.7f },
			{ 500.1f, 70.70f },
			{ 100.9f, 0.5f, 20.20f }
		};
		// 要素数を表示
		System.out.println("myarray.length " + myarray.length);
		System.out.println("myarray[0].length " + myarray[0].length);
		System.out.println("myarray[1].length " + myarray[1].length);
		System.out.println("myarray[2].length " + myarray[2].length);
		
		// 要素を表示
		System.out.println(myarray[0][0]);
		System.out.println(myarray[1][0]);
		System.out.println(myarray[1][1]);
		// System.out.println(myarray[1][2]);
		// System.out.println(myarray[1][3]);
		System.out.println(myarray[2][0]);
		System.out.println(myarray[2][1]);
		System.out.println(myarray[2][2]);
	}

}
