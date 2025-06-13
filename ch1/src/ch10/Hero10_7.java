package ch10;

//slip()はオーバーライドできないHeroクラス
public class Hero10_7 {

	public final void slip() {
		this hp -=5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
