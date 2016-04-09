package br.com.munif.algoritmos2.arvorebinariaordenada;

public class Arvore {

    public No raiz;

    public boolean estaVazia() {
        return raiz == null;
    }

    public void inserir(Informacao info) {
        if (estaVazia()) {
            raiz = new No();
            raiz.informacao = info;
        } else {
            inserirArvore(info, raiz);
        }
    }

    public void inserirArvore(Informacao info, No no) {
        if (info.valor < no.informacao.valor) {
            if (no.esquerda == null) {
                No novo = new No();
                novo.informacao = info;
                no.esquerda = novo;
            } else {
                inserirArvore(info, no.esquerda);
            }
        } else if (no.direita == null) {
            No novo = new No();
            novo.informacao = info;
            no.direita = novo;
        } else {
            inserirArvore(info, no.direita);
        }
    }
    
    //TAREFA Fazer o excluir, pelo menos no caso sem filho e com um filho
    //Vale 1 ponto
    

    public void mostra() {
        if (estaVazia()) {
            System.out.println("Está vazia");
        }
        mostraArvore(raiz);
    }

    private void mostraArvore(No raiz) {
        if (raiz.esquerda != null) {
            mostraArvore(raiz.esquerda);
        }
        raiz.informacao.mostra();
        if (raiz.direita != null) {
            mostraArvore(raiz.direita);
        }
    }

    /*
     *   VERSÕES FEIAS DAS COISAS 
     *   Thing's ugly versions 
     */
    public boolean estaVaziaFeio() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

}


//throw new RuntimeException("Não sei inseir em árvore com elementos");
