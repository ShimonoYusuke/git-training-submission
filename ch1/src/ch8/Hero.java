package ch8;

//メソッド「座る」「転ぶ」「逃げる」を追加
public class Hero {
	String name;    
	int hp;        

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	public void sit(int sec) {    //座る（sitメソッド）
		this.hp += sec;       //何秒座るか引数で受け取る　座る秒数だけHPを増やす
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}

	public void slip() {          //転ぶ（slipメソッド）
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

	public void run() {           //逃げる（runメソッド）
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}