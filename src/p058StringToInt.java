
public class p058StringToInt {
	public static void main(String args[]) {
		String s = "125";
		Integer obj = Integer.valueOf(s);
		int i = obj.intValue();
		i += 10;
		System.out.println(i);
	}

}

// Integerクラスの静的メソッドとインスタンスメソッドの使い方を示す。
// main()メソッドの最初で変数sに文字列リテラルを代入。
// 静的メソッドvalueOf()は、このStringオブジェクトを引数に取り、
// 新しいIntegerオブジェクト(sの表す値がカプセル化されている)を生成して返す。
// このオブジェクトは変数objに代入される。

// そのあと、インスタンスメソッドintValue()を使って、objにカプセル化されている値を
// int型で取得する。このメソッドの戻り値は変数iに代入される。
// 変数iの値が10だけ増やされ、println()で表示される。