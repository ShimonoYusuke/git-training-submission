package ch8;

//手続き型で作った勇者の冒険プログラム
public class Main2 {

	public static void main(String[] args) {
		int yusya_hp = 100;
		int matango1_hp = 50;
		int matango2_hp = 48;
		String yusya_name = "ミナト";
		int matango1_level = 10;
		int matango2_level = 10;
		System.out.println(yusya_name + "は5秒座った！");
		yusya_hp += 5;
		System.out.println("HPが5ポイント回復した");

	}

}
