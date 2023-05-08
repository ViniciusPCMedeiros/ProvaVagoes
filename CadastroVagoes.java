import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CadastroVagoes {
    private ArrayList<Vagao> vagoes;

    public CadastroVagoes(){

        vagoes = new ArrayList<>();

    }

    public void cadastra(Vagao v){

        vagoes.add(v);

    }
    
    public int quant(){

        return vagoes.size();
    }

    public Vagao getPorPosicao(int posi){

        if(posi >= 0 && posi < vagoes.size()){

            return vagoes.get(posi);
        }

            return null;
        }

        public Vagao getPorId(int id){

            for(Vagao vagao:vagoes){

                if (vagao.getIdentificador() == id){

                    return vagao;
                }

            }

            return null;
        }
        //questão 4 funcionando
        public List<Vagao> getPorPeso(int peso){

            List<Vagao> listaPeso = new ArrayList<>();

            for(Vagao vagao : vagoes){

                if(vagao.getCapacidadeCarga()<=peso){

                    listaPeso.add(vagao);

                }
            }
            

            return listaPeso;
        }
        public List toLista() {
            List <Vagao>lC = vagoes.stream()
            .collect(Collectors.toList());
            return lC;
        }


        @Override
        public String toString() {
    
            StringBuilder aux = new StringBuilder("\n");
            for (Vagao vagao : vagoes) {
                aux.append(vagao.toString() + "\n");
    
            }
            return aux.toString();
    
        }


}
