package ch15;

//6つのint値とDATE型の相互変換
import java.util.Calendar;
import java.util.Date;

public class Main15_12 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//6つのint値からDateインスタンスを生成
		c.set(2023, 8, 15, 5, 53, 20);
		c.set(Calendar.MONTH, 9);      //月を9（10月）に変更
		Date d = c.getTime();
		System.out.println(d);
		//Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);        //年を取り出す
		System.out.println("今年は" + y + "年です");

	}

}
