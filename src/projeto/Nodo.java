package projeto;

public class Nodo {
    Cliente cliente;
    Nodo proximo;

    public Nodo(Cliente cliente) {
        this.cliente = cliente;
        this.proximo = null;
    }
}

