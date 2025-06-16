package ch12;
//同じ指示で異なる操作をさせることができる
public class Main7 {

	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DethBat();
		for (Monster m : monsters) {
			m.run();
		}
	}
}
