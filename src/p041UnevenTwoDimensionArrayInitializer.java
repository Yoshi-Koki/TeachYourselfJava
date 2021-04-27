
public class p041UnevenTwoDimensionArrayInitializer {
	public static void main(String args[]) {
		// 配列を宣言し、領域を割り当て、初期化する
		int myarray[][] = {
			{ 33, 71 },
			{ -16, 45, 50, -7 },
			{ 99 }
		};
		
		// 配列とその要素の要素数を表示する
		System.out.println("myarray.length = " + myarray.length);
		System.out.println("myarray[0].length = " + myarray[0].length);
		System.out.println("myarray[1].length = " + myarray[1].length);
		System.out.println("myarray[2].length = " + myarray[2].length);
		
		// 要素を表示する
		System.out.println(myarray[0][0]);
		System.out.println(myarray[0][1]);
		System.out.println(myarray[1][0]);
		System.out.println(myarray[1][1]);
		System.out.println(myarray[1][2]);
		System.out.println(myarray[1][3]);
		System.out.println(myarray[2][0]);
		
	}

}
