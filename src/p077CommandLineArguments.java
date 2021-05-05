
public class p077CommandLineArguments {
	public static void main(String args[]) {
		System.out.println("args.length = " + args.length);
		System.out.println("args[0] = " + args[0]);
		System.out.println("args[1] = " + args[1]);
		System.out.println("args[2] = " + args[2]);
	}

}


//これまで紹介してきたJavaプログラムにはmain()という静的メソッドが必ず存在する。
//このメソッドは引数を1つ取る。これはStringオブジェクトの配列である。
//これらのオブジェクトはユーザがコマンドラインに入力した引数を表す。
//次にコマンドライン引数を取得する方法を説明する。
//配列なので、コマンドライン引数の個数はargs.lengthという式で取得できる。
//これはint型。
//個々の引数はargs[0]、args[1]、args[2]などで処理する。