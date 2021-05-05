
public class p082syntheticUnderstanding2 {
	public static void main(String args[]) {
		Boolean bool = Boolean.valueOf(args[0]);
		Character c = new Character(args[1].charAt(0));
		Byte b = Byte.valueOf(args[2]);
		Short s = Short.valueOf(args[3]);
		Integer i = Integer.valueOf(args[4]);
		Long l = Long.valueOf(args[5]);
		Float f = Float.valueOf(args[6]);
		Double d = Double.valueOf(args[7]);
		
		System.out.println(bool);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		
	}

}

//Boolean、Character、Byte、Short、Integer、Long、Float、Doubleの各クラスの8個のオブジェクトを作成し、
//それらのオブジェクトにコマンドライン引数から取得した値をカプセル化するプログラム。
//各オブジェクトの文字列表現で表示しなさい。

//例えば
//true A 25 300 -50 2000 0.51 3.1e8
//を指定する。