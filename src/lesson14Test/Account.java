package lesson14Test;

public class Account {
	String owner; //口座名義人
	int balance; //口座残高
	
	public Account(String owner,int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void transfer(Account dest,int amount) {
		//送金処理の記述(残高不足の場合は例外を送出)
		dest.balance += amount;
		balance -= amount;
		
		System.out.println("正常に送金完了しました。");
		//アサーション…稼働コードのソースコード内に直接テストケースを記述できる
		assert this.balance >= 0;
		
	}
}
