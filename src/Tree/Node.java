package Tree;

import Entities.Cliente;

public class Node {
    private Cliente valor;
    private Node esquerda;
    private Node direita;

    public Node(Cliente valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public Cliente getValor() {
        return valor;
    }

    public void setValor(Cliente valor) {
        this.valor = valor;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }
}
