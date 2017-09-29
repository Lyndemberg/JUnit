
package Source;
public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private double limiteCredito;

    public Conta(int numero, String titular, double saldo, double limiteCredito) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }
    public boolean sacar(double valor){
        if(valor>0){
            if(saldo<=0 || saldo<valor){
                return false;
            }else{
                saldo= saldo - valor;
                return true;
            }
        }else{
            return false;
        }
    }
    public boolean depositar(double valor){
        if(valor>0){
            saldo = saldo + valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean transferir(Conta destino, double valor){
        if(valor>0){
            if(saldo<=0 || saldo<valor){
                return false;
            }else{
                saldo = saldo - valor;
                destino.depositar(valor);
                return true;
            }
        }else{
            return false;
        }
    }
    public boolean comprarNoCredito(double valor){
        if(valor>0){
            if(limiteCredito<=0 || limiteCredito<valor){
                return false;
            }else{
                limiteCredito = limiteCredito - valor;
                return true;
            }
        }else{
            return false;
        }
    }
    
    
}
