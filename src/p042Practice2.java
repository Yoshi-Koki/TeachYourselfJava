
public class p042Practice2 {
	public static void main(String args[]) {
		int myarray[][] = {
			{ 2 },
			{ 4, 5 },
			{ 6, 7, 9}
		};
		// 要素数を表示する
		System.out.println("myarray.length = " + myarray.length);
		System.out.println("myarray[0].length = " + myarray[0].length);
		System.out.println("myarray[1].length = " + myarray[1].length);
		System.out.println("myarray[2].length = " + myarray[2].length);
		
		// 要素を表示する
		System.out.println(myarray[0][0]);
		System.out.println(myarray[1][0]);
		System.out.println(myarray[1][1]);
		System.out.println(myarray[2][0]);
		System.out.println(myarray[2][1]);
		System.out.println(myarray[2][2]);
	}
}
