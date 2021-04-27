
public class p064GarbageCollectionDemo {
	public static void main(String args[]) {
		Integer i = new Integer(5);
		// 最初のオブジェクトを生成
		System.out.println(i);
		i = new Integer(6);
		// 新しいオブジェクトを生成
		System.out.println("Integer(5) can be recycled ");
		System.out.println(i);
	}

}

//Integerオブジェクトが生成され、それが変数iに代入される。
//このオブジェクトは次のステートメントで使われる。
//もう1つのIntegerオブジェクトが生成され、それが変数iに代入される。
//その結果、最初のオブジェクトはどの変数からも参照されなくなり、がーべじコレクション候補となる。
