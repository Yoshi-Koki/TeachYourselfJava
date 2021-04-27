
public class p059StringToInt2 {
	public static void main(String args[]) {
		String s = "125";
		int i = Integer.valueOf(s).intValue();
		i += 10;
		System.out.println(i);
	}

}

// 静的メソッドvalueOf()はString引数を取り、Integerオブジェクトを返す。
// インスタンスメソッドintValue()はIntegerオブジェクトにカプセル化されている値をint型で返す。