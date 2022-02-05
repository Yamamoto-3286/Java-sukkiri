package lesson14Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest2 {

	@Test
	public void instantiate() {
		Account a = new Account("ヤマモト",-300);
		assertEquals("ヤマモト",a.owner);
		assertEquals(30000,a.balance);
		
	}
	
	@Test
	public void transfer() {
		
	}

}
