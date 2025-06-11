package ch2;

//ランダムな数を生成する命令
public class Main2_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int r = new java.util.Random().nextInt(90);  //くじ引き　よく使う
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
	}
}
