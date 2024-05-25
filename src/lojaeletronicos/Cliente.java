package lojaeletronicos;;

/**
 *
 * @author Andre
 */

public class Cliente {
    private String nome;
    private CarrinhoDeCompras carrinhoDeCompras;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinhoDeCompras = new CarrinhoDeCompras();
    }

    public String getNome() {
        return nome;
    }

    public CarrinhoDeCompras getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }
}
