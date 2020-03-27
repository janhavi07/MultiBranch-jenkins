import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void addTwoNumbers() {
        HelloWorld obj=new HelloWorld();
        int result = obj.addTwoNumbers(12, 1);
        Assert.assertEquals(result,11);
    }

    @Test
    public void concatTwoWords(){
        HelloWorld obj=new HelloWorld();
        String yourName = obj.addYourName("janhavi", "parte");
        Assert.assertEquals(yourName,"janhavi parte");


    }


}