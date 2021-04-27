
public class p034OneDimensionArray {
	public static void main(String args[]) {
		// 	配列を宣言して領域を割り当てる	
		int myarray[] = new int[4];
		
		// 要素を初期化する
		myarray[0] = 33;
		myarray[1] = 71;
		myarray[2] = -16;
		myarray[3] = 45;
		
		// 要素数を表示する
		System.out.println("myarray.length = " + myarray.length);
		
		// 要素を表示する
		System.out.println(myarray[0]);
		System.out.println(myarray[1]);
		System.out.println(myarray[2]);
		System.out.println(myarray[3]);
	}

}
