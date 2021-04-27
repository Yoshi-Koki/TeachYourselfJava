
public class p040TwoDimensionArrayInitializer {
	public static void main(String args[]) {
		// 配列を宣言し、領域を割り当て、初期化する
		int myarray[][] = {
			{33, 71},
			{-16, 45},
			{99, 27}
		};
		
		// 要素数を表示する
		System.out.println("myarray.length = " + myarray.length);
		
		// 要素を表示する
		System.out.println(myarray[0][0]);
		System.out.println(myarray[0][1]);
		System.out.println(myarray[1][0]);
		System.out.println(myarray[1][1]);
		System.out.println(myarray[2][0]);
		System.out.println(myarray[2][1]);
	}
		

}
