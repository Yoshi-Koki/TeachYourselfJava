
public class p079Practice2 {
	public static void main(String args[]) {
		// 半径を取得
		double radius = Double.valueOf(args[0]).doubleValue();
		// 面積を表示
		double area = Math.PI * radius * radius;
		System.out.println("Area is " + area);
	}

}

//コマンドラインから円の半径を受け取り、面積を表示するプログラム
