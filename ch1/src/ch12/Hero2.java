package ch12;
//Monsterならなんでも攻撃できるメソッド
public class Hero2 extends Character {
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

	public void attack(Monster m) {        //Monster攻撃用
		System.out.println(this.name + "の攻撃！");
		
	}

}
