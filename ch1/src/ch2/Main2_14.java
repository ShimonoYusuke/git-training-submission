package ch2;

//String型をint型に変換する命令
public class Main2_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String age = "31";
		int n = Integer.parseInt(age);  //型変更で無理やりに使う
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
	}
}
