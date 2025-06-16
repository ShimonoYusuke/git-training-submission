package ch10;

//SuperHeroを生み出してrun()を呼び出す
public class Main {

	public static void main(String[] args) {
		
		Hero h = new Hero();
		h.run();

		SuperHero sh = new SuperHero();
		sh.run();
		
	}
}