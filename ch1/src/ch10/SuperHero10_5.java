package ch10;

import ch9.Hero.Hero;

//SuperHeroクラスにrun()を再定義する
public class SuperHero extends Hero {
	boolean flying;          //新規追加したフィールド
	public void fly() {      //新規追加したメソッド
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {        //新規追加したメソッド
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {         //親クラスにも定義いてあるが、子クラスで再定義（上書き）するメソッド
		System.out.println(this.name + "撤退した！");
	}
}
