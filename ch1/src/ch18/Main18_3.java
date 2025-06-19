package ch18;

//Webページを取得する
import java.io.InputStream;
import java.net.URL;

public class Main18_3 {

	public static void main(String[] args) throws Exception {
		URL u = new URL("http://book.impress.co.jp/");     //インターネットへ接続
		InputStream is = u.openStream();
		int i = is.read();
		while (i != -1) {        //ページの終わりまで繰り返す
			char c = (char) i;
			System.out.print(c);      //読んだ内容を画面に表示
			i = is.read();
		}

	}

}
