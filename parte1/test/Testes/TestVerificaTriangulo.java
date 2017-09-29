
package Testes;

import Source.Fibonacci;
import Source.VerificarTriangulo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestVerificaTriangulo {
    @Test
    public void test1(){
        VerificarTriangulo v = new VerificarTriangulo(5,6,10);
        assertTrue(v.isTriangulo());
    }
    @Test
    public void test2(){
        VerificarTriangulo v = new VerificarTriangulo(5,6,20);
        assertFalse(v.isTriangulo());
    }
    @Test
    public void test3(){
        VerificarTriangulo v = new VerificarTriangulo(5,6,20);
        assertEquals("Não é um triângulo",v.getTipoTriangulo());
    }
    @Test
    public void test4(){
        VerificarTriangulo v = new VerificarTriangulo(6,6,6);
        assertEquals("Triângulo equilátero",v.getTipoTriangulo());
    }
    @Test
    public void test5(){
        VerificarTriangulo v = new VerificarTriangulo(6,6,10);
        assertEquals("Triângulo isósceles",v.getTipoTriangulo());
    }
    @Test
    public void test6(){
        VerificarTriangulo v = new VerificarTriangulo(6,10,6);
        assertEquals("Triângulo isósceles",v.getTipoTriangulo());
    }
    @Test
    public void test7(){
        VerificarTriangulo v = new VerificarTriangulo(10,6,6);
        assertEquals("Triângulo isósceles",v.getTipoTriangulo());
    }
    @Test
    public void test8(){
        VerificarTriangulo v = new VerificarTriangulo(6,7,8);
        assertEquals("Triângulo escaleno",v.getTipoTriangulo());
    }
    
}
