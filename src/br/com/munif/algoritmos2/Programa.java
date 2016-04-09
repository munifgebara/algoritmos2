package br.com.munif.algoritmos2;

import br.com.munif.algoritmos2.arvorebinariaordenada.Arvore;
import br.com.munif.algoritmos2.arvorebinariaordenada.Informacao;

public class Programa {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(new Informacao(10));
        arvore.inserir(new Informacao(5));
        arvore.inserir(new Informacao(13));
        arvore.inserir(new Informacao(7));
        arvore.inserir(new Informacao(15));
        arvore.mostra();
    }

}
