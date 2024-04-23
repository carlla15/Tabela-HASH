package projeto;

public class Cliente {
    int codCliente;
    String nome;

    public Cliente(int codCliente, String nome) {
        this.codCliente = codCliente;
        if (nome.length() > 100) {
            this.nome = nome.substring(0, 100); 
        } else {
            this.nome = String.format("%-100s", nome); 
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "codCliente=" + codCliente +
               ", nome='" + nome.trim() + '\'' + 
               '}';
    }
}
