
public class p027AssignmentProblem {
	public static void main(String args[]) {
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = b1 * b2;
		System.out.println(b3);
		
		int num;
		(float)num = 123.23f;
	}

}

// 問題は、byte b3 = b1 * b2;　というステートメントにある。
// エラーは代入ステートメントの右辺が自動的にint型に拡張されるため発生。
// 正常にコンパイルするためには、右辺の結果をbyte型に変換する必要がある。


// int num;
// (float)num = 123.23f;
// ↑代入ステートメントの左辺にある変数を型変換することはできない。