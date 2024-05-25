package lojaeletronicos;

/**
 *
 * @author Andre
 */

public abstract class Produto {
    private String marca;
    private String modelo;
    private double preco;

    public Produto(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public abstract String getEspecificacoes();
}
