package ch5;

//引数を1つだけ渡す
public class Main5_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("メソッドを呼び出します");
		hello("湊");  //湊を渡してhelloメソッドを呼び出す
		hello("朝香");  //朝香を渡してhelloメソッドを呼び出す
		hello("菅原");  //菅原を渡してhelloメソッドを呼び出す
		System.out.println("メソッドの呼び出しが終わりました");
	}

	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}
