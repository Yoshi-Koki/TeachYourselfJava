
public class p080Arraycopy {
	public static void main(String args[]) {
		int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int array2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		System.arraycopy(array1, 0, array2, 0, 5); // 配列をコピー
		System.out.print("array2: ");
		System.out.print(array2[0] + " ");
		System.out.print(array2[1] + " ");
		System.out.print(array2[2] + " ");
		System.out.print(array2[3] + " ");
		System.out.print(array2[4] + " ");
		System.out.print(array2[5] + " ");
		System.out.print(array2[6] + " ");
		System.out.print(array2[7] + " ");
		System.out.print(array2[8] + " ");
		System.out.print(array2[9] + " ");
		
	}

}

//arraycopy()メソッドの使い方
//5個の要素がarray1からarray2へコピーされる。
//そのあと、array2の10個の要素が表示される。