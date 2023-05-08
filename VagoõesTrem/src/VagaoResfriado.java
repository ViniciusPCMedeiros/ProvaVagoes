public class VagaoResfriado extends Vagao {
    private int valorTemperatura;
    //questão 3 funcionando
    public VagaoResfriado(String descricao, double capacidadeCarga,int valorTemperatura){
        super(descricao, capacidadeCarga);
        this.valorTemperatura = valorTemperatura;

    }

    public int getValorTemperatura() {

        return valorTemperatura;
    }
    @Override
    public String ValidaGen(){
        return"É um vagão Resfriado";
    }

    @Override
    public String toString() {
        
        return super.toString()+" ,  Valor da Temperatura: " + valorTemperatura ;
    }

    
    
}
