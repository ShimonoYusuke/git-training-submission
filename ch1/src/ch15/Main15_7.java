package ch15;

//splitメソッドを使った文字列の分割
public class Main15_7 {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");     //正規表現パターン
		for (String w : words) {
			System.out.print(w + "->");
		}

	}

}
