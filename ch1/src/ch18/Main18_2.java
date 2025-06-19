package ch18;

//ファイルに1文字ずつ書き込む
import java.io.FileWriter;

public class Main18_2 {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("data.txt");    //ファイルを開く
		fw.write('そ');     //1文字ずつ書く
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		fw.close();      //ファイルを閉じる

	}

}
