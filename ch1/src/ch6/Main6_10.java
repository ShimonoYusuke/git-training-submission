package ch6;
//API利用の例
public class Main6_10 {

	public static void main(String[] args) {
		int[] heights = {172, 149, 152, 191, 155};
		java.util.Arrays.sort(heights);
		for (int h : heights) {
			System.out.println(h);
		}

	}

}
