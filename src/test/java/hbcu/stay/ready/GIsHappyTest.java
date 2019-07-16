package hbcu.stay.ready;

import hbcu.stay.ready.StrangerStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class GIsHappyTest {

    private StrangerStrings strangerStrings;

    @Before
    public void setup(){
        strangerStrings = new StrangerStrings();
    }


    @Test
    public void gIsHappyTest1(){
        Boolean actual = strangerStrings.gIsHappy("xxggxx");
        Assert.assertTrue(actual);
    }

    @Test
    public void gIsHappyTest2(){
        Boolean actual = strangerStrings.gIsHappy("xxgxx");
        Assert.assertFalse(actual);
    }

    @Test
    public void gIsHappyTest3(){
        Boolean actual = strangerStrings.gIsHappy("xxggyygxx");
        Assert.assertTrue(actual);
    }

}
