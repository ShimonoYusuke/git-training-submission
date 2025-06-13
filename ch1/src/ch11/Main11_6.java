package ch11;

//継承の材料をnewとして利用されてしまう
public class Main11_6 {

	public static void main(String[] args) {
		Character c = new Character(); //HeroやWizardではなくCharacterをnewしてしまった！
		Matango m = new Matango('A');
		c.attack(m); //中身がないので何も動かない！

	}

}
