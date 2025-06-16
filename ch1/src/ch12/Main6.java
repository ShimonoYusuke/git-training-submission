package ch12;

//多様性と配列を組み合わせて宿屋に泊まる
public class Main6 {

	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		// 宿屋に泊まる
		for (Character ch : c) { // 1名ずつ順に取り出し
			ch.hp += 50; // HPを50回復する
		}

	}

}
