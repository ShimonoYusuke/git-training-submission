package ch5;

//mainメソッド以外からメソッドを呼び出す
public class Main5_3 {

	public static void methodA() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("methodA");
		methodB(); //methodBメソッドの呼び出し
	}

	public static void methodB() {
		System.out.print("methodB");
	}

	public static void main(String[] args) {
		methodA(); //methodAメソッドの呼び出し
	}
}
