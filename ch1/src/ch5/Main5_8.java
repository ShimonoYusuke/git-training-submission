package ch5;

//戻り値をそのまま使う
public class Main5_8 {

	public static int add(int x, int y) {
		// TODO 自動生成されたメソッド・スタブ
		int ans = x + y;
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(add(add(10, 20), add(30, 40)));
		//30に化ける　70に化ける
	}
}
