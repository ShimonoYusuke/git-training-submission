package ch9;

//剣を装備した勇者を生みだす
public class Main9_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;      //swordフィールドに生成済みの剣インスタンスを代入
		System.out.println("現在の武器は" + h.sword.name);    //勇者の剣の名前

	}

}
