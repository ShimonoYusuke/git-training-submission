package ch15;

//現在日時を表示する
import java.util.Date;    //importしておくと便利

public class Main15_11 {

	public static void main(String[] args) {
		Date now = new Date();           //現在の日時を取得
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1694984000000L);
		System.out.println(past);

	}

}
