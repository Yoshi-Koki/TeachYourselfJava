
public class p071DoubleDemo {
	public static void main(String args[]) {
		// 変数を宣言して初期化する
		double d1 = 0;
		double d2 = 0;
		// 除算
		double d3 = d1 / d2;
		System.out.println(d3);
		
		// 無限とNaNのテスト
		System.out.println(Double.isInfinite(d3));
		System.out.println(Double.isNaN(d3));
		
		// 最大、最小、無限の各値を表示する
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		
	}

}

//2つのdouble型変数を0で初期化し、一方をもう一方で割る。
//静的メソッドのisInfinite()とisNaN()を使ってテストする。
//(NaNは0を0で割ろうとしたことを表す)