package ch8;

//「眠る」操作に含まれる要素を記述
public class Hero8_7 {
	String name;
	int hp;

	public void sleep() {
		this.hp = 100; //自分自身のhpフィールド
		System.out.println(this.name + "は、眠って回復した！"); //自分自身のnameフィールド
	}
}
