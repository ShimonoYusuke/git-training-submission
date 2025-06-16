package ch11;

//インターフェースを継承する
public interface Human extends Creature {
	void talk();

	void watch();

	void hear();
	//さらに、親インターフェースからrun()を継承する
}
