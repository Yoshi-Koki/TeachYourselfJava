
public class p136Understanding4 {
	public static void main(String args[]) {
		// 配列の宣言、割り当て、初期化
		int size = args.length;
		double data[] = new double[size];
		for(int i = 0; i < size; i++)
			data[i] = Double.valueOf(args[i]).doubleValue();
		// 配列のソート
		for(int i = 0; i < size - 1; i++) {
			for(int j = i; j < size; j++) {
				if (data[j] > data[i]) {
					double temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
			}
		}
		// 配列を昇順に表示する
		for(int i = 0; i < size; i++)
			System.out.print(data[i] + " ");
		System.out.println("");
	}

}


//複数の引数を受け取り、それを数値に変換して、降順に表示するプログラムの作成。