
public class p074StringBufferDemo {
	public static void main(String args[]) {
		StringBuffer sb1 = new StringBuffer(); // 16文字分のバッファ
		StringBuffer sb2 = new StringBuffer(30); // 30文字分のバッファ
		StringBuffer sb3 = new StringBuffer("abcde"); // abcdeの5文字
		
		System.out.println("sb1.capacity = " + sb1.capacity());
		System.out.println("sb1.length = " + sb1.length());
		System.out.println("sb2.capacity = " + sb2.capacity());
		System.out.println("sb2.length = " + sb2.length());
		System.out.println("sb3.capacity = " + sb3.capacity());
		System.out.println("sb3.length = " + sb3.length());
	}

}
