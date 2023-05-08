public class Vagao {
    // se o trem  ste trem for necessaroo private int trem;
    private int identificador;
    private String descricao;
    private double capacidadeCarga;
    private static int proxIden = 1;

    public Vagao(String descricao, double capacidadeCarga){
        this.identificador = proxIden;
        this.descricao = descricao;
        this.capacidadeCarga = capacidadeCarga;
        //questão 1: this.capacidadeCarga = 5000;
        this.proxIden = proxIden+1; 
        
    }

    public int getIdentificador() {

        return identificador;
    }

    public static int getProxIden() {

        return proxIden;
    }

    public String getDescricao() {

        return descricao;
    }
//questão 6 implementada para verificar sé um vagão restaurante
    public String ValidaGen(){
        return"É UM VAGÃO COMUM";
    }

        
    

        
    

    public double getCapacidadeCarga() {

        return capacidadeCarga;
    }

    /*public void setTrem(int id){

        this.trem = id;
    }*/
    

    @Override
    public String toString() {

        return "\nTrem: " + " Identificador: " + identificador + ", Descricao: " + descricao
                + ", Capacidade de Carga: " + capacidadeCarga ;
    }



}