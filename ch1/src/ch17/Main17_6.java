package ch17;

//変数fwのスコープを広げると…(エラー)
import java.io.FileWriter;

public class Main17_6 {

	public static void main(String[] args) {
		FileWriter fw = new FileWriter("data.txt"); //mainメソッドブロック(5～12行目)をfwのスコープにする
		try {
			fw.write("hello!"); //スコープ内だからfwを利用可能！
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			fw.close(); //スコープ内だからfwを利用可能！
		}

	}

}
