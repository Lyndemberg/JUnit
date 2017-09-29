package Source;
public class Fatorial {
    
    public static long getFatorial(int valor){
        long fatorial = valor;
        int i = valor - 1;
        while (i>0){
            fatorial = fatorial * i;
            i--;
        }
        return fatorial;
    }
}
