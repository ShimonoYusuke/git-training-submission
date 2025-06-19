package ch17;

//例外インスタンスを自分で投げる
public class Main17_11 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-128);        //誤った値のセットを試みる⇒例外発生

	}

}
