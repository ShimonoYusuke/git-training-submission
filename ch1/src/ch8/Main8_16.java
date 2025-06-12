package ch8;

//仮想世界に勇者とお化けキノコ2匹を生み出す
public class Main8_16 {

	public static void main(String[] args) {
		Hero h = new Hero();     //勇者を生成し初期化
		h.name = "ミナト";
		h.hp = 100;

		Matango m1 = newMatango();     //お化けキノコA（1匹目）を生成し初期化
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();    //お化けキノコB（1匹目）を生成し初期化
		m2.hp = 48;
		m2.suffix = 'B';

		//冒険のはじまり
		h.slip();    //勇者は転ぶ
		m1.run();    //お化けキノコAが逃げる
		m2.run();    //お化けキノコAが逃げる
		h.run();     //勇者も逃げる
	}

}
