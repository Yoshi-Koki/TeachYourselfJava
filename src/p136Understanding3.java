
public class p136Understanding3 {
	public static void main(String args[]) {
		double total = 0;
		while(true) {
			double random = 9 * Math.random() + 1; // 1～10の間で乱数を生成
			System.out.println(random);
			total += random; // 合計
			System.out.println("Total = " + total);
			if (total > 100) // 100を超えたらループを抜ける
				break;
		}
	}

}


//1から10までの数値を無作為に発生させて表示するプログラムの作成。
//さらにそれらの数値の合計を計算して表示させる。
//そのあとこの合計が100を超えた時点でプログラムの実行を終了させる。
