package ch5;

//複数の引数を渡す
public class Main5_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		add(100, 20);  //100と20を渡してaddメソッドを呼び出す
		add(200, 50);  //200と50を渡してaddメソッドを呼び出す
	}

	//複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}
