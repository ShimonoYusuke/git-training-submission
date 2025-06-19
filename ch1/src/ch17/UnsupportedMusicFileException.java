package ch17;

//オリジナル例外を定義する
public class UnsupportedMusicFileException extends Exception { //チェック例外にする
	//エラーメッセージを受け取るコンストラクタ
	public UnsupportedMusicFileException(String msg) {
		super(msg);
	}

}
