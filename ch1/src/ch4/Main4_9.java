package ch4;

//for文を使って配列を扱う
public class Main4_9 {

	public static void main(String[] args) {
		// TODO 自動生成され たメソッド・スタブ
		int[] scores = { 20, 30, 40, 50, 80 };
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]); //ループのたびにiの値が0～4で変化する
		}
	}

}
