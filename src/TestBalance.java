import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author zakgl - zglawless
 * CIS175 - Fall 2021
 * Sep 7, 2022
 */

// This class tests the view balance function
public class TestBalance {

	SavingsAccount savings = new SavingsAccount();
	SavingsLogic logic = new SavingsLogic();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testViewBalance() { // tests the function using assertequals
		savings.setBalance(237.43);
		double balance = logic.viewBalance(savings);
		assertEquals(237.43, balance, 0.0);
	}

}
