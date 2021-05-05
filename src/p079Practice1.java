
public class p079Practice1 {
	public static void main(String args[]) {
		// 1番目のdouble型引数を取得
		double d1 = Double.valueOf(args[0]).doubleValue();
		// 2番目のdouble型引数を取得
		double d2 = Double.valueOf(args[1]).doubleValue();
		// 積を表示
		double product = d1 * d2;
		System.out.print("Product is " + product);
	}
}


//コマンドラインから2つのdouble型引数を受け取り、
//それらの積を表示するプログラム