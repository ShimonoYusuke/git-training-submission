package ch10;

import ch9.Hero.Hero;

//HeroとSuperheroのrun()を呼び出す
public class Main10_6 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.run();
		SuperHero sh = new SuperHero();
		sh.run();

	}

}
