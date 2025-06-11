package ch5;
//引数を使わずに値を渡せないのか？（エラー）
public class Main5_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 100;  //addメソッドで使用するつもり
		int y = 10;  //addメソッドを呼び出す
		add();
	}
	public static void add() {
		int ans = x + y;  //ここで使用するつもり（エラー）
		System.out.println(x + "+" + y + "=" + ans);
	}
}
