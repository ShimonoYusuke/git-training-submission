package ch11;

//オーバーライドしたつもりのHeroクラス
public class Hero11_5 extends Character {
	public void atack(Matango m) {        //attackのtが足りない
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

}
