package p150Practice1;

public class Sphere {
	double x;
	double y;
	double z;
	double radius;
	
	// thisメソッドで3つ目のコンストラクタに集約
	Sphere() {
		this(0, 0, 0, 1);
	}
	
	Sphere(double radius) {
		this(0, 0, 0, radius);
	}
	
	Sphere(double x, double y, double z, double radius) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.radius = radius;
	}

}

//5.4節(p147Practice)で作成したSphereクラスのオーバーロードコンストラクタをthisキーワードを使って修正。