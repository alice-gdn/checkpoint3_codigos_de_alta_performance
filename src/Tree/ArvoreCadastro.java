package Tree;

import Entities.Cliente;

//Arvore que organiza clientes usando como critério o CPF

public class ArvoreCadastro {

    Node raiz;

    public ArvoreCadastro() {
        this.raiz = null;
    }

    public void inserir(Cliente valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private Node inserirRecursivo(Node no, Cliente valor) {
        if (no == null) {
            return new Node(valor);
        }
        if (Integer.parseInt(no.getValor().getCPF()) > Integer.parseInt(valor.getCPF())) {
            no.setEsquerda(inserirRecursivo(no.getEsquerda(), valor));
        } else if (Integer.parseInt(no.getValor().getCPF()) < Integer.parseInt(valor.getCPF())) {
            no.setDireita(inserirRecursivo(no.getDireita(), valor));
        }
        return no;
    }

    public Cliente buscar(String cpf) {
        return buscarRecursivo(raiz, cpf).getValor();
    }

    private Node buscarRecursivo(Node no, String cpf) {
        //se chegar em null, o cpf nao existe na arvore
        if (no == null) {
            return null;
        }
        //caso encontrado retorna o cliente
        if (Integer.parseInt(no.getValor().getCPF()) == Integer.parseInt(cpf)) {
            return no;
        }
        //caso o cpf seja menor do que o nó atual, busca recursivamente a esquerda
        if (Integer.parseInt(no.getValor().getCPF()) > Integer.parseInt(cpf)) {
            return buscarRecursivo(no.getEsquerda(), cpf);
        }
        // caso o cpf seja maior que o nó atual, busca recursivamente a direita
        else {
            return buscarRecursivo(no.getDireita(), cpf);
        }

    }
}
