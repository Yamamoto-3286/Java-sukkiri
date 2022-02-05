package lesson14Test;


public class AssertionSample {

	public static void main(String[] args) {
		int age = 33;
		assert (++age >= 20);
		System.out.println("あなたの来年の年齢は" + age);
	}
}
