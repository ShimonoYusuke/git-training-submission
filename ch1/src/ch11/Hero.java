package ch11;

//未来の開発者が作成するHeroクラス
public class Hero extends Character {
	public void attack(Matango m) {          //Characterのattackメソッドをオーバーライドする
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}
}
