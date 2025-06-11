package ch3;

//天気による行動の変化をjavaで表す
public class Main3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean tenki = true;
		if (tenki == true) {
			//もし変数tenkiがtrueだったら…
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			//そうでなければ
			System.out.println("映画を見ます");
		}
	}

}
