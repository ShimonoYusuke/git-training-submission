package ch6;

//API利用の例
public class Main6_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] heights = { 172, 149, 152, 191, 155 };
		java.util.Arrays.sort(heights);  //Javaが備える並べ替え命令
		for (int h : heights) {
			System.out.println(h);
		}
	}

}
