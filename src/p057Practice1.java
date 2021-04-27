
public class p057Practice1 {
	public static void main(String args[]) {
		String s = "One Two Three Foue Five Six Seven";
		int len = s.length();
		String substring = s.substring(len -10, len);
		System.out.println(substring);
	}

}

// 文字列の最後の10文字から成る部分文字列を表示するプログラム