package royandcipherdisc;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoyAndCipherDiscTest {
    
    private RoyAndCipherDisc royAndCipherDisc;
    
    @BeforeMethod
    public void init() {
        royAndCipherDisc = new RoyAndCipherDisc();
    }
    
    @DataProvider(name="inputExpectedOutput")
    public Object[][] inputExpectedOutputMap() {
        return new Object[][] {
            { "", "" },
            { "aeiou", "0 4 4 6 6" },
            { "hackerearth", "7 -7 2 8 -6 13 13 -4 -9 2 -12" },
            { "aaaaaa", "0 0 0 0 0 0" },
            { "aabbcc", "0 0 1 0 1 0" }
        };
    }
    
    @Test(dataProvider="inputExpectedOutput")
    public void getMaxNestingLevelInKQuotedStringShouldReturnExpectedValues( String input, String expected ) {
        String actual = royAndCipherDisc.encryptMessage(input);
        assertEquals(actual, expected);
    }
    
    @DataProvider(name="inputExpectedException")
    public Object[][] inputExpectedException() {
        return new Object[][] {
            { null }
        };
    }
    
    @Test(dataProvider="inputExpectedException", expectedExceptions=RuntimeException.class, expectedExceptionsMessageRegExp="Input must not be null!")
    public void encryptMessageShouldThrowRuntimeException( String input) {
        royAndCipherDisc.encryptMessage(input);
    }
    
}
