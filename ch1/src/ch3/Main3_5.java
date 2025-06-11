package ch3;
//あんまり使わない
//caseラベルに複数の値を指定する
public class Main3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		case 1, 2 -> {
			//fortuneが１か2なら…
			System.out.println("いいね！");
		}
		case 3 -> {
			//fortuneが3なら…
			System.out.println("普通です");
		}
		case 4, 5 -> {
			//fortuneが４なら…
			System.out.println("う～ん…");
		}
		}
	}

}
