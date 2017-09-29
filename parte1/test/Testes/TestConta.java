package Testes;

import Source.Conta;
import Source.Cubo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestConta {
    @Test
    public void test1(){
        Conta c = new Conta(1, "Lyndemberg", 1000, 1200);
        assertFalse("Saldo indisponível", c.sacar(1001));
    }
    @Test
    public void test2(){
        Conta c = new Conta(1, "Lyndemberg", 1000, 1200);
        assertFalse("Limite indisponível", c.comprarNoCredito(1201));
    }
    @Test
    public void test3(){
        Conta c = new Conta(1, "Lyndemberg", 1000, 1200);
        assertFalse("Tentando sacar valor negativo", c.sacar(-10));
    }
    @Test
    public void test4(){
        Conta c = new Conta(1, "Lyndemberg", 1000, 1200);
        assertFalse("Tentando depositar valor negativo", c.depositar(-500));
    }
    @Test
    public void test5(){
        Conta c = new Conta(1, "Lyndemberg", 1000, 1200);
        assertFalse("Compra negativa no crédito", c.comprarNoCredito(-5));
    }
    @Test
    public void test6(){
        Conta c = new Conta(1, "Lyndemberg", 0, 1200);
        Conta c2 = new Conta(2, "Chico", 500, 800);
        assertFalse("Transferência sem saldo", c.transferir(c2, 200));
    }
    @Test
    public void test7(){
        Conta c = new Conta(1, "Lyndemberg", 200, 1200);
        Conta c2 = new Conta(2, "Chico", 500, 800);
        assertFalse("Transferência com valor negativo", c.transferir(c2, -100));
    }
    
}
