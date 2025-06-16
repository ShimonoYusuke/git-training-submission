package ch12;
//Wizardにfireballを使わせる
public class Main3 {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c = w;     //Character型の箱に代入
		Matango m = new Matango();
		c.name = "アサカ";
		c.attack(m);
		c.fireball(m);       //エラーが発生する
	}

}

