
public class p062MultipleRreference {
	public static void main(String args[]) {
		Integer obj1 = new Integer(5);
		Integer obj2 = obj1;
		Integer obj3 = obj1;
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
	}

}
// 複数の変数から同じオブジェクトを参照できることを示す