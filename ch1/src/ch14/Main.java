package ch14;

//何も定義してないクラスでtoString()を呼ぶ
public class Main {

	public static void main(String[] args) {
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);

	}

}
