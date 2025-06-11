package ch3;

//波カッコを省略した記述
public class Main3_3 {
/*文字列は ＝＝ では認識できない
 *.equals()を使う
 *文字列で ＝＝ を使った場合、コンパイルエラーは起きず実行できるけど時々変な動きをする
 *＝＝→ひとつのものを使いまわしてる、＝→見た目や形が同じもの　使い分け
 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean tenki = true; //ここでtrueかfalseを代入
		if (tenki == true) {
			//内容が2行なので波カッコは省略不可能
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else
			//1行しかないので波カッコは省略可能
			System.out.println("映画を見ます");
	}

}
