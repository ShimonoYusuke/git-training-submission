package ch14;

public class Hero {
	//Heroクラスの文字情報を表示する
	String name;
	int hp;
	
	//意図する文字列表現を返すtoString()を定義
	public String toString() {
		return "名前 : " + this.name + "/HP : " + this.hp;
	}
} 

