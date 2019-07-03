package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.MultipleOccurancesOfGivenWord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurancesOfGivenWordTest {
MultipleOccurancesOfGivenWord object;
    @Before
    public void setUp() throws Exception {
        object=new MultipleOccurancesOfGivenWord();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
public void givensentenceShouldReturnMultipleOccurancesOfGivenWord()
{
    String result=object.findMultipleOccorancesOfGivenWord("She sells seashells by the seashore","se");
    assertEquals("Found at:4 - 6 Found at:10 - 12 Found at:27 - 29",result);
}
@Test
    public void givenSentenceShouldReturnErrorMessageForNullInput()
    {
        String result=object.findMultipleOccorancesOfGivenWord("She sells seashells by the seashore","");
        assertEquals("Please enter valid sentence and word.It should not be empty and null",result);
    }
    @Test
    public void givenNullSentenceShouldReturnErrorMessageForGivenInput()
    {
        String result=object.findMultipleOccorancesOfGivenWord("","se");
        assertEquals("Please enter valid sentence and word.It should not be empty and null",result);
    }
    @Test
    public void givenNullSentenceShouldReturnErrorMessageForNullInput()
    {
        String result=object.findMultipleOccorancesOfGivenWord("","");
        assertEquals("Please enter valid sentence and word.It should not be empty and null",result);
    }
}