package ch3;

//伝統的なswitch文の利用
public class Main3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		case 1, 2:
			//case1:case2と2行で記述してもよい
			System.out.println("いいね！");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4, 5:
			System.out.println("う～ん…");
		}
	}

}
