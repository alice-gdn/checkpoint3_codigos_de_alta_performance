import Entities.Cliente;
import Tree.ArvoreClientes;

public class Main {
    public static void main(String[] args) {

        ArvoreClientes arvore = new ArvoreClientes();
        arvore.inserir(new Cliente("alice","1","123",10));
        arvore.inserir(new Cliente("bob","2","123",10));
        arvore.inserir(new Cliente("charlie","3","123",10));
    }
}
