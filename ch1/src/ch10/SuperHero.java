package ch10;

//Heroクラスを継承してSuperHeroを作成する
public class SuperHero extends Hero {
	
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}

	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println(this.name + "は飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
		
	}
}
