
package Testes;

import Source.Fatorial;
import Source.Fibonacci;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFibonacci {
    
    @Test
    public void test1(){
        assertEquals(8, Fibonacci.getEnesimo(6));
    }
    @Test
    public void test2(){
        assertEquals(55, Fibonacci.getEnesimo(10));
    }
    @Test
    public void test3(){
        assertEquals(89, Fibonacci.getEnesimo(11));
    }
}
