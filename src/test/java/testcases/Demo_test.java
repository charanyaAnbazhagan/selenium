package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_test {
	@Test
void Test1()
{
	String expres,actres;
	expres="Google";
	actres="Gmail";
	Assert.assertEquals(expres, actres);
}
	@Test
void Test2()
{
	String expres,actres;
	expres="Google";
	actres="Google";
	Assert.assertEquals(expres, actres);
}
}
