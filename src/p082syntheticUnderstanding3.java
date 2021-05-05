
public class p082syntheticUnderstanding3 {
	public static void main(String args[]) {
		// 配列を作成し、初期化する
		Character array[] = new Character[5];
		array[0] = new Character('A');
		array[1] = new Character('B');
		array[2] = new Character('C');
		array[3] = new Character('D');
		array[4] = new Character('E');
		
		// 文字列バッファを作成
		StringBuffer sb = new StringBuffer();
		
		// 配列要素をバッファに付加する
		sb.append(array[0]);
		sb.append(array[1]);
		sb.append(array[2]);
		sb.append(array[3]);
		sb.append(array[4]);
		
		// 文字列バッファを表示する
		System.out.println(sb);
	}

}


//配列を作成し、それを5個のCharacterオブジェクトで初期化する。
//そのあと、StringBufferオブジェクトを作成。
//その文字列バッファに配列要素を付加する。
//最後に文字列バッファを表示する。