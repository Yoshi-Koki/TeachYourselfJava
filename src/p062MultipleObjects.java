
public class p062MultipleObjects {
	public static void main(String args[]) {
		Integer obj = new Integer(5);
		System.out.println(obj);
		obj = new Integer(6);
		System.out.println(obj);
		obj = new Integer(7);
		System.out.println(obj);
	}

}
// あるオブジェクトを参照していた変数が、そのあと、別のオブジェクトを参照できることを示す