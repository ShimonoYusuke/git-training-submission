package ch8;

//仮想世界に勇者を生み出すプログラム
public class Main {

	public static void main(String[] args) {
		//（以下の内容をjavaで記述していく）
		// 勇者よ、この仮想世界に生まれよ！
		// お化けキノコよ、この仮想世界に生まれよ！
		// 勇者よ、戦え！
		// お化けキノコよ、逃げろ！

		//1.勇者を生成
		Hero h = new Hero();
		//2.フィールドに初期値をセット
		h.name = "ミナト"; //変数hのnameに代入
		h.hp = 100; //変数hのhpに代入
		System.out.println("勇者" + h.name + "を生み出しました！");
		//3.勇者のメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}

}
