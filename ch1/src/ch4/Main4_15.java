package ch4;

//実行結果は？
public class Main4_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arrayA = { 1, 2, 3 }; //arrayA[0]は1
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100; //arrayB[0]に100を代入
		System.out.println(arrayA[0]); //arrayA[0]を表示すると…
	}

}
