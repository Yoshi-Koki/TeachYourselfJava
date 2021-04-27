
public class p072Practice2 {
	public static void main(String args[]) {
		String strOctal = "22";
		String strHex = "45";
		String strDecimal = "78";
		short o = Short.parseShort(strOctal, 8);
		short h = Short.parseShort(strHex, 16);
		short d = Short.parseShort(strDecimal, 10);
		
		System.out.println(o);
		System.out.println(h);
		System.out.println(d);
		System.out.println(o + h + d);
	}

}
