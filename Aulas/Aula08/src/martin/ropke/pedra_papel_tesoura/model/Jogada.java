package martin.ropke.pedra_papel_tesoura.model;

import martin.ropke.pedra_papel_tesoura.enumarecao.Resultado;

public abstract class Jogada {
    final public Resultado verificarResultado(Jogada jogada) {
        if(verificarSeGanhei(jogada)){
            return Resultado.GANHOU;
        }
        if(verificarSePerdi(jogada)){
            return Resultado.PERDEU;
        }
        return Resultado.EMPATOU;
    }

    public abstract boolean verificarSePerdi(Jogada jogada);
    public abstract boolean verificarSeGanhei(Jogada jogada);
    
}
