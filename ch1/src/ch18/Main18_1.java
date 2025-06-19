package ch18;

//ファイルから1文字ずつ読み込む
import java.io.FileReader;

public class Main18_1 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("data.txt");    //ファイルを開く
		int input = fr.read();
		//↓ファイルの最後まで1文字ずつ読む
		while (input != -1) {
			System.out.print((char) input);
			input = fr.read();
		}
		fr.close();      //ファイルを閉じる

	}

}
