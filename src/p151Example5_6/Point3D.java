package p151Example5_6;

public class Point3D {
	double x;
	double y;
	double z;
	
	Point3D(double x) {
		this(x, 0, 0);
	}
	
	Point3D(double x, double y) {
		this(x, y, 0);
	}
	Point3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// インスタンスメソッド
	void move(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

}

// Point3Dクラスを改良するために、点の位置を変更するmove()というインスタンスメソッドを作成する。
//このメソッドの3つの引数は、移動先の座標です。
//Point3DMethodクラスのmain()メソッドでは、Point3Dオブジェクトを作成して
//次にオブジェクトを移動して新しい座標を表示する。