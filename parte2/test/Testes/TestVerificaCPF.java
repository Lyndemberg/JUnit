
package Testes;

import Source.VerificaCPF;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestVerificaCPF {
    @Test
    public void test_1(){
       assertTrue(VerificaCPF.verificar("333.124.987-40"));
    }
    
    @Test
    public void test_2(){
       assertFalse(VerificaCPF.verificar("333.124.987-45"));
    }
    
    @Test
    public void test_3(){
       assertFalse(VerificaCPF.verificar("333.124.987"));
    }
    
    @Test
    public void test_4(){
       assertFalse(VerificaCPF.verificar("333.124.987.456-20"));
    }
}
