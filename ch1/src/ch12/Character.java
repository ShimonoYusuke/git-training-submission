package ch12;

//Characterを継承して定義されたWizardクラス
public abstract class Character {
	String name;
	int hp;

	public void run() {
	}

	public abstract void attack(Matango m);

}
