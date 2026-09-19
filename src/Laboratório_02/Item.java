package Laboratório_02;

public class Item {
    private String nomeProduto;
    private double valor;

    public Item(String nomeProduto, double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValor() {
        return valor;
    }
}