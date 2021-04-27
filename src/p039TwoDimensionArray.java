
public class p039TwoDimensionArray {
	public static void main(String args[]) {
		// 配列を宣言して領域を割り当てる
		int myarray[][] = new int[3][2];
		
		// 要素を初期化する
		myarray[0][0] = 33;
		myarray[0][1] = 71;
		myarray[1][0] = -16;
		myarray[1][1] = 45;
		myarray[2][0] = 99;
		myarray[2][1] = 27;
		
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
