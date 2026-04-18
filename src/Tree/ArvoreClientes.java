package Tree;

import Entities.Cliente;

public class ArvoreClientes {

    Node raiz;
    public ArvoreClientes() {
        this.raiz = null;
    }

    public void inserir (Cliente valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    public Node inserirRecursivo (Node no, Cliente valor) {
        if (no == null) {
            return new Node(valor);
        }
        if (Integer.parseInt(no.getValor().getCPF()) > Integer.parseInt(valor.getCPF())) {
            no.setEsquerda(inserirRecursivo(no.getEsquerda(), valor));
        }else if (Integer.parseInt(no.getValor().getCPF()) < Integer.parseInt(valor.getCPF())) {
            no.setDireita(inserirRecursivo(no.getDireita(), valor));
        }
        return no;
    }
}
