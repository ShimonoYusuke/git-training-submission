package ch4;
//配列を用いた点数管理プログラム(エラー)
public class Main4_8 {

public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20,30,40,50,80};
		int sum = scores[1] + scores[2]
				+ scores[3] + scores[4] + scores[5];  //合計の算出
		int avg = sum / scores.length;  //平均の算出
		System.out.println("合計点:" + sum);  //合計と平均の表示
		System.out.println("平均点:" + avg);
	}

}
