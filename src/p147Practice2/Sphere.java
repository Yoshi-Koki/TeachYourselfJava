package p147Practice2;

public class Sphere {
	double x;
	double y;
	double z;
	double radius;
	
	// シグネチャの異なる3つのコンストラクタを定義
	Sphere() {
		radius = 1;
	}
	
	Sphere(double aradius) {
		radius = aradius;
	}
	
	Sphere(double ax, double ay, double az, double aradius) {
		x = ax;
		y = ay;
		z = az;
		radius = aradius;
	}

}


//3つのコンストラクタを持つSphereクラスを定義するアプリケーションを作成する。
//1つ目のコンストラクタは引数を受け取らず、球体の中心が原点上にあり、半径が1であるとして処理する。
//2つ目のコンストラクタは球体の半径を表すdouble型の値を受け取り、球体の中心が原点上にあるとして処理する。
//3つ目のコンストラクタは4つのdouble型の値を受け取る。これらは球体の中心の座標と半径である。