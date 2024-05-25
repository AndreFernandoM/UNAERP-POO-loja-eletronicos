package lojaeletronicos;

/**
 *
 * @author Andre
 */

public class TV extends Produto {
    private int tamanho;
    private String resolucao;

    public TV(String marca, String modelo, double preco, int tamanho, String resolucao) {
        super(marca, modelo, preco);
        this.tamanho = tamanho;
        this.resolucao = resolucao;
    }

    @Override
    public String getEspecificacoes() {
        return "Tamanho: " + tamanho + " polegadas, Resolução: " + resolucao;
    }
}
