package ch10;

//親クラスのattack()を呼び出す
public class Superhero10_9 {
	public void attack(Matango m) {
		super.attack(m); //親インスタンス部分のattack()を呼び出し
		if (this.flying) {
			super.attack(m); //親インスタンス部分のattack()を呼び出し
		}
	}

}
