package ch10;

import ch8.Matango;

//朝香さんが作成したSuperHeroクラス
public class SuperHero { //クラス名を書き換えた
	String name = "ミナト";
	int hp = 100;
	boolean flying; //flyフィールドを追加
	//戦う

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

	//飛ぶ
	public void fly() { //fly()を追加
		this.flying = true;
		System.out.println(this.name + "は飛び上がった！");
	}

	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
}
