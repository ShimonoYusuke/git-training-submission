package ch10;

//コントラクタを呼び出せない状況（エラー）
public class Item {
	String name;
	int price;

	public Item(String name) { //引数1つのコンストラクタ
		this.name = name;
		this.price = 0;
	}

	public Item(String name, int price) { //引数2つのコンストラクタ
		this.name = name;
		this.price = price;
	}
}
