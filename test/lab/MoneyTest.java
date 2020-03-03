package lab;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.After;
import org.junit.Before;
  
import java.util.Collection;
import junit.framework.TestCase; 

import org.junit.Test;

@RunWith(Parameterized.class)
public class MoneyTest{
	private int x;
	private String expected;
	private Money money;
	
	public MoneyTest(String expected, int x)
	{
		this.expected = expected;
		this.x = x;
	}
	
	@Before
	public void setUp() throws Exception{
		money = new Money();
	}
	
	@After
	public void tearDown() throws Exception{
		money = null;
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]
				{
			{"No", 94},
			{"Yes", 0},
			{"Yes", 93},
			{"Yes", 92},
			{"Yes", 90},
			{"No", 89},
			{"No", 59},
			{"No", 54},
			{"No", 45},
			{"Yes", 40},
			{"Yes", 38},
			{"Yes", 23},
			{"Yes", 15},
			{"Yes", 10},
			{"Yes", 6}
				});
	}

	@Test
	public void testCheck() {
		assertEquals(this.expected, money.check(x));
	}

}

