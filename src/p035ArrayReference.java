
public class p035ArrayReference {
	public static void main(String args[]) {
		// array1を宣言し、領域を割り当てる
		float array1[] = new float[3];
		
		// array1を初期化する
		array1[0] = -3.45f;
		array1[1] = 7.7f;
		array1[2] = 101.56f;
		
		// array2を宣言し、領域を割り当てる
		float array2[] = new float[3];
		
		// array2にarray1と同じ配列を参照させる
		array2 = array1;
		
		// array2の要素を表示する
		System.out.println("array2:");
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		
		// 要素を変更する
		array2[1] = 100;
		
		// array1の要素を表示する
		System.out.println("array1:");
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		
		
		// array2の要素を表示する
		System.out.println("array2:");
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		
	}

}
