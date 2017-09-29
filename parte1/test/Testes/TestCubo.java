
package Testes;

import Source.Cubo;
import Source.Fibonacci;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCubo {
    @Test
    public void test1(){
        assertEquals(9, Cubo.getAreaLado(3) , 0);
    }
    @Test
    public void test2(){
        assertEquals(16, Cubo.getAreaLateral(2) , 0);
    }
    @Test
    public void test3(){
        assertEquals(24, Cubo.getAreaTotal(2) , 0);
    }
    @Test
    public void test4(){
        assertEquals(27, Cubo.getVolume(3) , 0);
    }
    @Test
    public void test5(){
        assertEquals(100, Cubo.getAreaLado(10) , 0);
    }
    @Test
    public void test6(){
        assertEquals(125, Cubo.getVolume(5) , 0);
    }
}
