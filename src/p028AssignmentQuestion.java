
public class p028AssignmentQuestion {
	public static void main(String args[]) {
		short s1 = 1;
		short s2 = s1 + 1;
		System.out.println(s2);
	}
}
// 縮小変換がなぜ問題につながるのか？
// 代入ステートメントの左辺の変数に範囲外の不正な値が代入される可能性がある