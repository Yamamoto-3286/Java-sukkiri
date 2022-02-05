package lesson14Test;

//テストクラス
public class AccountTest {

	public static void main(String[] args) {
		testInstantiate(); // 1つめのテスト
		testTransfer(); // 1つめのテスト
	}

	// 実際にAccountをnewして使って見るテスト
	private static void testInstantiate() {
		System.out.println("無事newできるかテスト");

		Account a = new Account("ヤマモト",30000);

		if (!"ヤマモト".equals(a.owner)) {
			System.out.println("失敗！名義人がおかしい");
		}
		if (30000 != a.balance) {
			System.out.println("失敗！残高がおかしい");
		}
		System.out.println("テストを終了します");
	}
	
	private static void testTransfer() {
		
	}

}
