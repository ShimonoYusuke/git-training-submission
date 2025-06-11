package ch8;

//勇者インスタンスを生成して初期値を代入
public class Main8_12 {

	public static void main(String[] args) {
		//1.勇者を生成
		Hero h = new Hero();
		//2.フィールドに初期値をセット
		h.name = "ミナト";       //変数hのnameに代入
		h.hp = 100;              //変数hのhpに代入
		System.out.println("勇者" + h.name + "を生み出しました！");
	}

}
