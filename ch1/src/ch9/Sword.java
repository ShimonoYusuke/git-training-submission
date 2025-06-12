package ch9;

//Sword型フィールドを持つHeroクラス
//まず、Swordクラスを定義しておく
public class Sword {
	String name; //剣の名前
	int damage; //剣の攻撃力
}

//次にHeroクラスを定義する
public class Hero {
	String name;
	int hp;
	Sword sword; //勇者が装備している剣の情報

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
}
