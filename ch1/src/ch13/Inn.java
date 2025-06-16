package ch13;

//宿屋クラスの不具合
public class Inn {
	public void checkIn(Hero1 h) {
		h.hp = -100; //不具合の原因
	}

}