package lojaeletronicos;

/**
 *
 * @author Andre
 */

public class Laptop extends Produto {
    private String processador;
    private int ram;

    public Laptop(String marca, String modelo, double preco, String processador, int ram) {
        super(marca, modelo, preco);
        this.processador = processador;
        this.ram = ram;
    }

    @Override
    public String getEspecificacoes() {
        return "Processador: " + processador + ", RAM: " + ram + "GB";
    }
}
