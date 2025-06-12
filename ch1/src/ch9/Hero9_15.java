package ch9;
//別のコンストラクタを呼び出す
public class Hero9_15 {
	String name;
	int hp;
	
	public Hero(String name) {      //コンストラクタ①
		this.hp = 100;
		this.name = name;
	}
	public Hero() {       //コンストラクタ➁
		this("ダミー");       //コンストラクタ①を呼び出すようJVMに依頼する
	}
}
