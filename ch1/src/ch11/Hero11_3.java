package ch11;

//未来の開発者が作成するHeroクラス
public class Hero11_3 extends Character {
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

}
