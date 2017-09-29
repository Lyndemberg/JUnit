package Source;
public class Aviao {
    private boolean ligado;
    private boolean voando;
    private int potencia;
    private double velocidade;
    public Aviao(){
        ligado = false;
        voando = false;
        velocidade = 0;
        potencia = 1000;
    }
    public boolean ligar(){
        if(ligado == true){
            return false;
        }else{
            ligado = true;
            return true;
        }
    }
    public boolean desligar(){
        if(ligado == true){
            ligado = false;
            return true;
        }else{
            return false;
        }
    }
    public boolean acelerar(double valor){
        if(ligado==true){
            velocidade = velocidade + valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean desacelerar(double valor){
        if(ligado==true){
            velocidade = velocidade - valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean voar(){
        if(voando == false){
            if(ligado==true){   
                voando = true;
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }
    public boolean pousar(){
        if(voando == true){
            velocidade = 0;
            voando = false;
            return true;
        }else{
            return false;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
}
