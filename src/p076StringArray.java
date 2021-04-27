
public class p076StringArray {
	public static void main(String args[]) {
		String array[] = new String[5];
		array[0] = "String 0";
		array[1] = "String 1";
		array[2] = "String 2";
		array[4] = "String 4";
		
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
	}

}

//オブジェクトの配列
//１，配列を宣言する。
//２、配列要素のスペースを確保する。
//そのあと、要素を初期設定する。
//
//位置３の配列要素は明示的に初期化されていないのでオブジェクトを参照していない。
//そのため出力がnullとなる。
//null値は変数がどのオブジェクトも参照していないことを表す。