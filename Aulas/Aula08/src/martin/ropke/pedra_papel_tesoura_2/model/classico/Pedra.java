package martin.ropke.pedra_papel_tesoura_2.model.classico;


import martin.ropke.pedra_papel_tesoura_2.model.Jogada;
import martin.ropke.pedra_papel_tesoura_2.model.jeff.Lagarto;
import martin.ropke.pedra_papel_tesoura_2.model.jeff.Spoke;

public class Pedra extends Jogada{
    @Override
    public Jogada[] jogadasQueGanhei() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }
   
    @Override
    public Jogada[] jogadasQuePerdi() {
        return new Jogada[]{new Papel(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
