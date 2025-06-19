package ch17;
//try-catchの後でcloseすると…(エラー)
import java.io.FileWriter;
import java.io.IOException;

public class Main17_4 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("date.txt");
			fw.write("hello!");
		} catch (IOException e) {
			System.out.println("エラーです");
		}
		fw.close();
		

	}

}
