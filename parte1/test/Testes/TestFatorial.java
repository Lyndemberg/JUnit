package Testes;

import Source.Fatorial;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFatorial {
    
    @Test
    public void test1(){
        assertEquals(120, Fatorial.getFatorial(5));
    }
    @Test
    public void test2(){
        assertEquals(3628800, Fatorial.getFatorial(10));
    }
    @Test
    public void test3(){
        assertEquals(2432902008176640000L, Fatorial.getFatorial(20));
    }
}
