import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Cardapio c1 = new Cardapio();

        Comida  um= new Comida("batata frita", "tuberculo frito", 5);
        Comida  dois= new Comida("batata cozida", "tuberculo cozido", 3);
        Comida  tres= new Comida("batata assada", "tuberculo assasdo", 10);

        c1.cadastra(tres);
        c1.cadastra(dois);
        c1.cadastra(um);


        //minha implementação de cardapio funcionando
        System.out.println("\nImplementaçao da classe cardapio");
        System.out.println(c1.toString());

        VagaoRestaurante r1 = new VagaoRestaurante("top", 20, c1);

        Vagao r2 = new Vagao("cabine", 320);

       
        
        
        //questão 2 funcionando
        System.out.println("\nQuestao 2");
        System.out.println(r2.getProxIden());

        CadastroVagoes cad = new CadastroVagoes();

        //questão 5 funcionando
        System.out.println("\nQuestão 5");

        cad.cadastra(r1);
        cad.cadastra(r2);

    System.out.println(cad.toString());
    
        //Questão 6 funcionando

        System.out.println("\nQuestao 6");
        System.out.println(r2.ValidaGen());
        
        //questão 7 implementada

        System.out.println("\nQuestao 7");

        List<Vagao> mTrem = cad.getPorPeso(500);

Collections.sort(mTrem, Comparator.comparing(Vagao::getDescricao));

for (Vagao vagao : mTrem) {
    System.out.println(vagao.toString());
    
     }
    }
}
