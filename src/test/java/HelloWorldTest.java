import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void addTwoNumbers() {
        HelloWorld obj=new HelloWorld();
        int result = obj.addTwoNumbers(12, 1);
        Assert.assertEquals(result,13);
    }
}