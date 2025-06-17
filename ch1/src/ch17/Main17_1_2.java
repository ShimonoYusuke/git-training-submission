package ch17;

//例外処理を用意してないと
import java.io.FileWriter;
import java.io.IOException;

public class Main17_1_2 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();
		} catch (IOException e) {
			System.out.println("エラーが発生しました。");
		}

	}

}
