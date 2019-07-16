package hbcu.stay.ready;

import hbcu.stay.ready.StrangerStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountTripleTest {

    private StrangerStrings strangerStrings;

    @Before
    public void setup(){
        strangerStrings = new StrangerStrings();
    }

    @Test
    public void countTripleTest1(){
        Integer expected = 1;
        Integer actual = strangerStrings.countTriple("abcXXXabc");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countTripleTest2(){
        Integer expected = 3;
        Integer actual = strangerStrings.countTriple("xxxabyyyycd");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countTripleTest3(){
        Integer expected = 0;
        Integer actual = strangerStrings.countTriple("a");
        Assert.assertEquals(expected, actual);
    }


}
