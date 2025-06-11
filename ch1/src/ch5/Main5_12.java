package ch5;

//引数に配列を受け取るメソッド
public class Main5_12 {
	//int型配列を受け取り、すべての要素を表示するメソッド
	public static void printArray(int[] array) { //引数に配列型を指定
		// TODO 自動生成されたメソッド・スタブ
		for (int element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		printArray(array); //配列を渡す
	}
}
