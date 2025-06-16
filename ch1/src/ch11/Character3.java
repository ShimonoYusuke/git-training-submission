package ch11;

//Characterクラスを作成（未完成）
public abstract class Character3 {
	String name;
	int hp;

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	//戦う
	public abstract void attack(Matango m);     //　メソッドを空にしておく
	
}

