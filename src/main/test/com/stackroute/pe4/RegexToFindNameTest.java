package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.RegexToFindName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexToFindNameTest {
RegexToFindName  object;
    @Before
    public void setUp() throws Exception {
        object=new RegexToFindName();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void givenInputShouldReturnTrueForHarry(){
        boolean result = object.checkForHarryInTheGivenString("This is Harry");
        assertEquals(true,result);
    }

    @Test
    public void givenInputShouldReturnFalseForHenry(){
        boolean result = object.checkForHarryInTheGivenString("This is Henry.");
        assertEquals(false,result);
    }



    @Test
    public void givenInputShouldReturnFalseForEmptyString(){
        boolean result = object.checkForHarryInTheGivenString("");
        assertEquals(false,result);
    }
}