package projeto;

public class Main {
    public static void main(String[] args) {
        TabelaHash hashTable = new TabelaHash(10); // Tamanho da tabela hash
        hashTable.inserir(new Cliente(14, "João"));
        hashTable.inserir(new Cliente(23, "Maria"));
        hashTable.inserir(new Cliente(34, "Ana"));

        hashTable.imprimir();

        Cliente cliente = hashTable.buscar(23);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente);
        } else {
            System.out.println("Cliente não encontrado");
        }
    }
}
