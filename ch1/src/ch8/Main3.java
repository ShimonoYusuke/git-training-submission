package ch8;

//仮想世界に勇者とお化けキノコ2匹を生み出す
public class Main3 {

	public static void main(String[] args) {
		// 1.勇者を生成
		Hero h = new Hero(); //勇者を生成し初期化
		// 2.フィールドに初期化をセット
		h.name = "ミナト"; // 変数hのnameに代入
		h.hp = 100; //変数hのhpに代入

		Matango m1 = new Matango(); //お化けキノコA（1匹目）を生成し初期化
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango(); //お化けキノコB（1匹目）を生成し初期化
		m2.hp = 48;
		m2.suffix = 'B';

		//冒険のはじまり
		h.slip(); //勇者は転ぶ
		m1.run(); //お化けキノコAが逃げる
		m2.run(); //お化けキノコAが逃げる
		h.run(); //勇者も逃げる
	}

}
