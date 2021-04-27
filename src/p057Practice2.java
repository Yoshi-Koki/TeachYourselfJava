
public class p057Practice2 {
	public static void main(String args[]) {
		String s = "One,Two,Three,Foue,Five,Six,Seven";
		int i = s.lastIndexOf(',');
		String s2 = s.substring(i + 1);
		System.out.println(s2);
	}

}

// カンマで区切られた文字列の最後の文字列を表示するプログラム
// int i = s.lastIndexOf(',');　←　末尾から「,」の位置を探してその数字を返す
// String s2 = s.substring(i + 1);　←　iの次の位置以降の文字列を抜き出す
