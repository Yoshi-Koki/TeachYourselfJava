
public class p081Understanding06 {
	public static void main(String args[]) {
		// 地球での体重を取得
		double ew = Double.valueOf(args[0]).doubleValue();
		// 月での体重を表示する
		double mw = ew * .17;
		System.out.println("Moon weight: " + mw);
	}

}

//月の重力は地球の約17パーセント。地球での体重をコマンドライン引数として受け取り、
//月で測った体重を表示するプログラム