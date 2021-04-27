
public class p056DollarAmount {
	public static void main(String args[]) {
		String s1 = "The total cost is $45.67";
		int i1 = s1.indexOf('$'); // $で始まる文字列を探し、その位置を返す
		String s2 = s1.substring(i1); // i1の位置以降の文字列を抜き出す
		System.out.println(s2); // $45.67
		System.out.println(i1); // 18
	}

}

// 文字「$」で始まる文字列を探し、それに続く文字列を合わせて表示する