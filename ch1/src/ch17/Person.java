package ch17;

public class Person {
	int age;

	public void setAge(int age) {
		if (age < 0) { //ここで引数をチェック
			throw new IllegalArgumenException("年齢は0以上の数にすべきです。指定値=" + age);
		}
		this.age = age; //問題ないなら、フィールドに値をセット
	}

}
