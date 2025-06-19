package ch17;

//後片付け処理もtry-catchする
import java.io.FileWriter;
import java.io.IOException;

public class Main17_8 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt"); //tryブロック内でコンストラクタが動作する
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				;
			}
		}

	}

}
