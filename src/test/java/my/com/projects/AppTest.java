package my.com.projects;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void TestApp(){
		App app = new App();
		Assert.assertEquals("Hello", app.sayHello());
	}

}
