package ch9;

//コンストラクタのオーバーロード
public class Hero9_12 {
	String name;
	int hp;

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
	}

}
