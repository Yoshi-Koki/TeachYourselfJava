
public class p081Understanding07 {
	public static void main(String args[]) {
		// 角度を取得する
		double degrees = Double.valueOf(args[0]).doubleValue();
		// ラジアンに変換する
		double radians = degrees * Math.PI / 180;
		// 三角関数の値を表示する
		System.out.println("cos = " + Math.cos(radians));
		System.out.println("sin = " + Math.sin(radians));
		System.out.println("tan = " + Math.tan(radians));
		
	}

}

//コマンドライン引数として角度を受け取り、余弦、正弦、正接を表示するプログラム