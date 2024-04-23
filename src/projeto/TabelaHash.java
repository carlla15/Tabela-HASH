package projeto;

public class TabelaHash {
    private Nodo[] tabela;
    private int tamanho;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;  
        this.tabela = new Nodo[tamanho];
    }

    private int funcaoHash(int chave) {
        return chave % 7; 
    }

    public void inserir(Cliente cliente) {
        int index = funcaoHash(cliente.codCliente);
        Nodo novoNodo = new Nodo(cliente);
        if (tabela[index] == null) {
            tabela[index] = novoNodo;
        } else {
            Nodo atual = tabela[index];
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNodo;
        }
    }

    public Cliente buscar(int codCliente) {
        int index = funcaoHash(codCliente);
        Nodo atual = tabela[index];
        while (atual != null) {
            if (atual.cliente.codCliente == codCliente) {
                return atual.cliente;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void imprimir() {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("Índice " + i + ": ");
            Nodo atual = tabela[i];
            while (atual != null) {
                System.out.print(atual.cliente + " -> ");
                atual = atual.proximo;
            }
            System.out.println("None");
        }
    }
}
