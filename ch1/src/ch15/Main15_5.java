package ch15;

//プレイヤー名を判定するメソッド
public class Main15_5 {
	public boolean isValidPlayerName(String name) {
		if (name.length() != 8) {         //8文字であること
			return false;
		}
		char first = name.charAt(0);
		if (!(first >= 'A' && first <= 'Z')) {       //最初の1文字はA～Z
			return false;
		}
		for (int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {       //以降の文字はA～Zか0～9
				return false;
			}
		}
		return true;
	}

}