package p147Practice1;

public class Circle {
	double x;
	double y;
	double radius;
	
	// シグネチャの異なる2つのコンスタントを定義
	Circle(double aradius) {
		radius = aradius;
	}
	
	Circle(double ax, double ay, double aradius) {
		x = ax;
		y = ay;
		radius = aradius;
	}

}


//2つのコンスタントを持つCircleクラスを定義するアプリケーションの作成。
//一方のコンストラクタは、円の半径を表すdouble型の値を受け取り、
//円の中心が原点上(0,0)にあるとして処理を行う。
//もう一方のコンストラクタは、3つのdouble型の値を受け取る。
//最初の2つの引数は中心の座標で、3つ目の引数は半径である。