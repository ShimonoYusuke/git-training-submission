package ch3;

//トイレの空きを待つ繰り返し
public class Main3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean doorClose = true; //ここでtrueかfalseを代入
		while (doorClose == true) {
			//ドアが閉まっている間は…
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
	}
	//3行目がtrueの場合、このプログラムを実行すると無限ループが発生します。
}
