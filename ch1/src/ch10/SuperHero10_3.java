package ch10;

//Heroクラスを継承してSuperHeroを作成する
public class SuperHero10_3 extends Hero {
	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

}
