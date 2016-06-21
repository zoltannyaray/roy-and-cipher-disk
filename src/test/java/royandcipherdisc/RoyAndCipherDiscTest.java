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
            { "hackerearth", "7 -7 2 8 -6 13 13 -4 -9 2 -12" }
        };
    }
    
    @Test(dataProvider="inputExpectedOutput")
    public void getMaxNestingLevelInKQuotedStringShouldReturnExpectedValues( String input, String expected ) {
        String actual = royAndCipherDisc.encryptMessage(input);
        assertEquals(actual, expected);
    }
    
}
