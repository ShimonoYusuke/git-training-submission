package ch9;

//コンストラクタで引数を追加情報とした受け取る
public class Hero9_10 {
	String name;
	int hp;

	public Hero(String name) {     //引数として文字列を1つ受け取る
		this.hp = 100;
		this.name = name; //引数の値でnameフィールドを初期化

	}

}
