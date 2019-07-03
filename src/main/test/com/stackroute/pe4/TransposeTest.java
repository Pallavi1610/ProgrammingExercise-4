package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.Transpose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose object;

    @Before
    public void setUp() throws Exception {
        object=new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        object=null;

    }
    @Test
    public void givenSentenceShouldReturnTranposeOfWords()
    {
        String result=object.getTransposeOfaString("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }
    @Test
    public void givenNullStringShouldReturnEmptyString(){
        String actulResult = object.getTransposeOfaString("");
        assertEquals("",actulResult);
    }

}