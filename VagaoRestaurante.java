public class VagaoRestaurante extends Vagao {
    private Cardapio menu;

    public VagaoRestaurante(String descricao, double capacidadeCarga,Cardapio menu){
        super(descricao, capacidadeCarga);
        this.menu = menu;

    }

    public Cardapio getMenu() {
        return menu;
    }
    @Override
    public String ValidaGen(){
        return" É um vagão Restaurante "+"\n"+ getMenu();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
