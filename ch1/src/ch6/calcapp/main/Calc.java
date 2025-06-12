package ch6.calcapp.main;

//mainメソッドだけが残されたCalc.java
public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10; int b = 2;
		int total = ch6.calcapp.logics.CalcLogic.tasu(a, b);
		int delta = ch6.calcapp.logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}
