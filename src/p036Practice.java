
public class p036Practice {
	public static void main(String args[]) {
		byte array[] = new byte[4];
		array[0] = 2;
		array[1] = 4;
		array[2] = 8;
		array[3] = 16;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		
		double d[] = new double[4];
		d[0] = 5500;
		d[1] = 2314;
		d[2] = 5121;
		d[3] = 4523;
		
		double total = d[0];
		total += d[1];
		total += d[2];
		total += d[3];
		
		System.out.println("Average is " + total / 4);
		
	}

}
