
package Source;
public class Fibonacci {
    public static int getEnesimo(int n){
        int enesimo;
        if(n == 0 || n==1){
            enesimo = n;
        }else{
            enesimo = getEnesimo(n-1) + getEnesimo(n-2);
        }
        
        return enesimo;
    }
}
