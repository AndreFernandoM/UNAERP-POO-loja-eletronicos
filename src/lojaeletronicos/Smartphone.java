package lojaeletronicos;

/**
 *
 * @author Andre
 */

public class Smartphone extends Produto {
    private String sistemaOperacional;
    private int armazenamento;

    public Smartphone(String marca, String modelo, double preco, String sistemaOperacional, int armazenamento) {
        super(marca, modelo, preco);
        this.sistemaOperacional = sistemaOperacional;
        this.armazenamento = armazenamento;
    }

    @Override
    public String getEspecificacoes() {
        return "Sistema Operacional: " + sistemaOperacional + ", Armazenamento: " + armazenamento + "GB";
    }
}
