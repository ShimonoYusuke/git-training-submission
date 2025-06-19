package ch17;
//tryブロック内でnewすると…(エラー)
import java.io.FileWriter;

public class Main17_7 {

	public static void main(String[] args) {
		FileWriter fw;   //mainメソッドブロック(5～13行目)はfwのスコープのまま
		try {
			fw = new FileWriter("data.txt");    //tryブロック内でコンストラクタが動作する
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			fw.close();
		}

	}

}
