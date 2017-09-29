package Testes;

import Source.Aviao;
import Source.Conta;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestAviao {
    @Test
    public void test1(){
        Aviao a = new Aviao();
        assertFalse("Voar com avião desligado", a.voar());
    }
    @Test
    public void test2(){
        Aviao a = new Aviao();
        assertFalse("Pousar sem estar voando", a.pousar());
    }
    @Test
    public void test3(){
        Aviao a = new Aviao();
        a.ligar();
        a.acelerar(200);
        assertEquals(200, a.getVelocidade(),0);
    }
    @Test
    public void test4(){
        Aviao a = new Aviao();
        a.ligar();
        a.acelerar(200);
        a.desacelerar(100);
        assertEquals(100, a.getVelocidade(),0);
    }
    @Test
    public void test5(){
        Aviao a = new Aviao();
        assertFalse("Tentando acelerar desligado", a.acelerar(0));
    }
    @Test
    public void test6(){
        Aviao a = new Aviao();
        assertFalse("Tentando desacelerar desligado", a.desacelerar(0));
    }
    
}
