package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.ReplaceACharacter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceACharacterTest {
ReplaceACharacter object;
    @Before
    public void setUp() throws Exception {
        object=new ReplaceACharacter();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void givenASentenceShouldReturnSentenceWithReplacedCharacters()
    {
        String result=object.replaceCharacterWithOtherCharacter("daily dry");
        assertEquals("faity fry",result);
    }
    @Test
    public void givenNullStringShouldReturnNullString() {
        String result=object.replaceCharacterWithOtherCharacter("");
        assertEquals("",result);

    }

}