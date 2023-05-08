import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//desculpa por fazer coisas amais mas você não disse como cardapio era implementada
public class Cardapio {
    private ArrayList<Comida> meni;


    public Cardapio(){

        meni = new ArrayList<>();

    }

    public void cadastra(Comida c){

        meni.add(c);

    }

    public void removerItem(Comida item) {

        meni.remove(item);

    }

   
    

       
    

    @Override
    public String toString() {
        List lF = meni.stream()
        .map(c ->c.toString())
        .collect(Collectors.toList());
        return "\n"+ lF;
    }
    
}