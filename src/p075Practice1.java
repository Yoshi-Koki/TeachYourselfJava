
public class p075Practice1 {
	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("abcde");
		
		s.append("fgh");
		s.append("ijklz");
		
		System.out.println(s);
		System.out.println("s.capacity = " + s.capacity());
		System.out.println("s.length = " + s.length());
		
	}

}

//StringBufferオブジェクトを生成し、文字を付加して
//文字列バッファの容量とサイズを表示