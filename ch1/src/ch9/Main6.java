package ch9;

//コントラクタが定義されたHeroを生み出す
public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();    //インスタンス生成と同時にコンストラクタによってHPに100が代入される

		System.out.println(h.hp);    //100と表示される
	}

}
