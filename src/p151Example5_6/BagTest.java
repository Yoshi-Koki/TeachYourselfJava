package p151Example5_6;

public class BagTest {
	public static void main(String args[]) {
		Bag bag = new Bag();
		System.out.println(bag.flag);
		System.out.println(bag.i);
		System.out.println(bag.j);
		System.out.println(bag.k);
		System.out.println(bag.l);
		
		for(int i = 0; i < bag.array.length; i++)
			System.out.println(bag.array[i]);
		System.out.println(bag.s1);
		System.out.println(bag.s2);
	}
}

//この例では、インスタンス変数の宣言と初期化の方法を説明する。
//さまざまなデータ型のインスタンス変数から成るBagというクラスを使う。
//一部のインスタンス変数はクラスのオブジェクトを作成するときに規定値に初期化される。
//それ以外のインスタンス変数は、プログラムで明示的に初期化する。
//
//クラスBagTestではBagオブジェクトを作成する。
//そのあと、Bagオブジェクトのインスタンス変数の値を表示する。
//変数flag、i、l、m、s1には規定値としてそれぞれfalse、0、0、0、nullが格納されることに注目する。