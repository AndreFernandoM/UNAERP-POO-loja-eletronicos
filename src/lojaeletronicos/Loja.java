package lojaeletronicos;

import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class Loja {

    private Cliente cliente;
    private Scanner scanner;

    public Loja() {
        cliente = new Cliente("Plotze");
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            
            System.out.println("\t######################");
            System.out.println("Menu:\n");
            System.out.println("1 - Adicionar Itens");
            System.out.println("2 - Carrinho");
            System.out.println("3 - Remover Item do Carrinho");
            System.out.println("4 - Sair");
            System.out.print("> Escolha uma opcao: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarItens();
                    break;
                case 2:
                    cliente.getCarrinhoDeCompras().exibirCarrinho();
                    break;
                case 3:
                    removerItem();
                    break;
                case 4:
                    System.out.println("\nSaindo...\n");
                    scanner.close();
                    return;
                default:
                    System.out.println("\n\tOpcao invalida. Tente novamente.\n");
            }
        }
    }

    private void adicionarItens() {
        System.out.println("\t######################");
        System.out.println("Escolha um item para adicionar ao carrinho:\n");
        System.out.println("1 - Smartphone <R$7999.99>");
        System.out.println("2 - Laptop <R$3599.99>");
        System.out.println("3 - TV <R$4299.99>");
        System.out.print("> Escolha uma opcao: ");
        int opcaoItem = scanner.nextInt();

        Produto produto = null;
        switch (opcaoItem) {
            case 1:
                produto = new Smartphone("\nApple", "iPhone 13", 7999.99, "iOS", 128);
                break;
            case 2:
                produto = new Laptop("\nDell", "Inspiron 15", 3599.99, "Intel i7", 16);
                break;
            case 3:
                produto = new TV("\nSamsung", "QLED 4K", 4299.99, 55, "4K");
                break;
            default:
                System.out.println("\n\tOpcao invalida. Retornando ao menu principal.\n");
                return;
        }

        System.out.print("> Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        cliente.getCarrinhoDeCompras().adicionarProduto(produto, quantidade);
        System.out.println("> Produto adicionado ao carrinho.\n");
        

    }

    private void removerItem() {
        CarrinhoDeCompras carrinho = cliente.getCarrinhoDeCompras();
        carrinho.exibirCarrinho();
        if (!carrinho.vazio()) {
            System.out.print("\nDigite o numero do item que deseja remover: ");
            int indice = scanner.nextInt();

            if (indice > 0 && indice <= carrinho.getItens().size()) {
                carrinho.removerProduto(indice - 1);
                System.out.println("> Produto removido do carrinho.\n");
            } else {
                System.out.println("\n\tOpcao invalida. Retornando ao menu principal.\n");
            }
            
        }
        return;

    }
}
