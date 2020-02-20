import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCases
{
	@Test
	void test()
	{
		//should be true just not in right format no
		assertTrue(Telephone.isFormatted(Telephone.format("1234567891")));
	}
	
	@Test
	void test2()
	{
		//should be false because not proper length
		assertFalse(Telephone.isFormatted(Telephone.format("121")));
	}
	
	@Test
	void test3()
	{
		//should not accept letters. this case fails the test.
		assertFalse(Telephone.isFormatted(Telephone.format("abcdefghij")));
	}
}
