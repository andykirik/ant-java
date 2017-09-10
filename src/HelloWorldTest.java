import org.junit.*;
import ak.*;

public class HelloWorldTest extends junit.framework.TestCase {

    public void testOkay() {
	HelloWorld hw = new HelloWorld();
	int nResult = hw.abs(1);
	assertEquals(1, nResult);
    }
    
    public void testWillFail() {
	HelloWorld hw = new HelloWorld();
	int nResult = hw.abs(-1);
	assertEquals(1, nResult);
    }
    
}
