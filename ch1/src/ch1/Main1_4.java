package ch1;

//書き換えてはいけない変数の値を上書きしてしまう
public class Main1_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double pi = 3.14;  //円周率を入れた変数
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");
		pi = 10;  //誤り！代入すべき変数はpie
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
	}
}
