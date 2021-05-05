package p151Example5_6;

public class Point3DMethod {
	public static void main(String args[]) {
		Point3D p = new Point3D(1.1, 3.4, -2.8);
		
		Point3D p2 = new Point3D(9.6, 8.8, 100.2); // ←追記
		
		System.out.println("p.x = " + p.x);
		System.out.println("p.y = " + p.y);
		System.out.println("p.z = " + p.z);
		
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		System.out.println("p2.z = " + p2.z);
		
		p.move(5, 5, 5);
		System.out.println("p.x = " + p.x);
		System.out.println("p.y = " + p.y);
		System.out.println("p.z = " + p.z);
		
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		System.out.println("p2.z = " + p2.z);
		
	}

}






//個々のPoint3Dオブジェクトを操作することがmove()メソッドの機能です。
//したがって、1つのオブジェクトを移動してもほかのオブジェクトの位置は変わらない。
//
//たとえば次のmain()メソッドではオブジェクトを2つ作成する。
//表示されるメッセージを調べれば一方を移動してももう一方に影響がないことがわかる。

//p2オブジェクトのインスタンス変数の値は変化しているが
//独立している別のオブジェクトp2の内容は変化していない。