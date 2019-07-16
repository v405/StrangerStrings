package hbcu.stay.ready;

import hbcu.stay.ready.StrangerStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class RemoveStringTest {

    private StrangerStrings strangerStrings;

    @Before
    public void setup(){
        strangerStrings = new StrangerStrings();
    }


    @Test
    public void withoutStringTest1(){
        String expected = "He there";
        String actual = strangerStrings.removeString("Hello there", "llo");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest2(){
        String expected = "Hllo thr";
        String actual = strangerStrings.removeString("Hello there", "e");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest3(){
        String expected = "Hello there";
        String actual = strangerStrings.removeString("Hello there", "x");
        Assert.assertEquals(expected, actual);
    }

}
