package ch15;

//StringBuilderで文字列を1万回連結する
public class Main15_4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");        //①バッファにjavaを追加
		}
		String s = sb.toString();     //②完成した連結済み文字列を取り出す
		System.out.println(s);

	}

}
