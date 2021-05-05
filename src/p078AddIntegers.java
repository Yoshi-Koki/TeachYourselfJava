
public class p078AddIntegers {
	public static void main(String args[]) {
		// 最初の整数を取得する
		int i = Integer.parseInt(args[0]);
		
		// 次の整数を取得する
		int j = Integer.parseInt(args[1]);
		
		// 合計を表示する
		int sum = i + j;
		System.out.print("Sum is " + sum);
	}

}


//2つのコマンドライン引数を受け取り、それらを整数に変換し、合計を表示する