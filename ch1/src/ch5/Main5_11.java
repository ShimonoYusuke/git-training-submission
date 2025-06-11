package ch5;

//オーバーロード（引数の数が異なる場合）
public class Main5_11 {

	public static int add(int x, int y) { //1つ目のメソッド
		// TODO 自動生成されたメソッド・スタブ
		return x + y;
	}

	public static int add(int x, int y, int z) { //2つ目のメソッド
		return x + y + z;
	}

	public static void main(String[] args) {
		System.out.println("10+20=" + add(10, 20)); //1つ目のaddメソッドが呼び出される
		System.out.println("10+20+30=" + add(10, 20, 30)); //2つ目のaddメソッドが呼び出される
	}
}
