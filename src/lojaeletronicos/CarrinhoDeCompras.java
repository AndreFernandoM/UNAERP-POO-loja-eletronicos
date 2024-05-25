package lojaeletronicos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andre
 */


public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    public void removerProduto(int indice) {
        if (indice >= 0 && indice < itens.size()) {
            itens.remove(indice);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }
    
    public boolean vazio(){
        return (itens.isEmpty()? true: false);
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void exibirCarrinho() {
        if (itens.isEmpty()) {
            System.out.flush();
            System.out.println("O carrinho esta vazio.");
        } else {
            int index = 1;
            for (ItemCarrinho item : itens) {
                Produto produto = item.getProduto();
                System.out.println(index + " - Produto: " + produto.getMarca() + " " + produto.getModelo() + 
                                   " - Quantidade: " + item.getQuantidade() + 
                                   " - Preco unitario: R$" + produto.getPreco());
                index++;
            }
            System.out.println("Total: R$" + calcularTotal());
        }
    }
}
