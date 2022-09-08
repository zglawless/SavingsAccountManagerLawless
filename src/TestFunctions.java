import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author zakgl - zglawless
 * CIS175 - Fall 2021
 * Sep 7, 2022
 */

/**
 * This test case tests the deposit and withdraw functions
 */
public class TestFunctions {

	SavingsAccount savings = new SavingsAccount();
	SavingsLogic logic = new SavingsLogic();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDeposit() { // tests the deposit using assertequals
		savings.setBalance(500);
		savings.setDeposit(1000);
		double balance = logic.depositMoney(savings);
		assertEquals(1500, balance, 0.0);
	}
	
	@Test
	public void testWithdraw() {// tests the withdraw using assertequals
		savings.setBalance(300);
		savings.setWithdraw(1500);
		double balance = logic.withdrawMoney(savings);
		assertEquals(-1200, balance, 0.0);
	}

}
