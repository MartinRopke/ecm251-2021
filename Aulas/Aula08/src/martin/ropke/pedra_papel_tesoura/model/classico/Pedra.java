package martin.ropke.pedra_papel_tesoura.model.classico;

import martin.ropke.pedra_papel_tesoura.model.Jogada;
import martin.ropke.pedra_papel_tesoura.model.jeff.Lagarto;
import martin.ropke.pedra_papel_tesoura.model.jeff.Spoke;

public class Pedra extends Jogada{
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Tesoura) ||  (jogada instanceof Lagarto);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) ||  (jogada instanceof Spoke);
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
