package lesson1;

public class StringEqual {

	public static void main(String[] args) {
		String str1 = "スッキリJava";
		String str2 = "Java";
		String str3 = "java";
		
		//内容が等しいか調べるメソッド
		if(str2.equals(str3)) {
			System.out.println("s2とs3は等しい");
		}
		
		//大文字、小文字区別せずに内容が等しいか調べるメソッド
		if(str2.equalsIgnoreCase(str3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		
		//文字列の長さを調べるメソッド
		System.out.println("s1の長さは" + str1.length() + "です。");
		
		//内容が空かどうか調べるメソッド
		if(str1.isEmpty()) {
			System.out.println("s1は空文字です。");
		}
	}
}
