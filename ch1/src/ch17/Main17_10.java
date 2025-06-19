package ch17;

//try-with-resources文の利用
import java.io.FileWriter;

public class Main17_10 {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt");) {   //try-catch文をぬける際に自動的にclose()が呼び出されるのでfinallyブロックの記述は不要
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}

	}

}
