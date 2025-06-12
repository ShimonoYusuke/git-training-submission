package ch9;

//コンストラクタをオーバーロードしたクラスの利用
public class Main9_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero("ミナト");    //文字列引数があるのでコンストラクタ①が呼び出される
		System.out.println(h1.name);
		Hero h2 = new Hero();            //引数がないのでコンストラクタ➁が呼び出される
		System.out.println(h2.name);
	}

}
