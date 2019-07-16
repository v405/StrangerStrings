package hbcu.stay.ready;

import hbcu.stay.ready.StrangerStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class ContainsEqualNumberOfIsAndNotTest {

    private StrangerStrings strangerStrings;

    @Before
    public void setup(){
        strangerStrings = new StrangerStrings();
    }

    @Test
    public void equalIsNotTest1(){
        Boolean actual = strangerStrings.containsEqualNumberOfIsAndNot("This is not");
        Assert.assertTrue(actual);
    }

    @Test
    public void equalIsNotTest2(){
        Boolean actual = strangerStrings.containsEqualNumberOfIsAndNot("This is notnot");
        Assert.assertFalse(actual);
    }

    @Test
    public void equalIsNotTest3(){
        Boolean actual = strangerStrings.containsEqualNumberOfIsAndNot("noisxxnotyynotxisi");
        Assert.assertTrue(actual);
    }
}
