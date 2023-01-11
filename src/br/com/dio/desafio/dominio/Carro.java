package br.com.dio.desafio.dominio;

public class Carro extends Modelo{
    private String placa;
    private int preco;
    private String cor;
    private Boolean disponivel;
    final int comissao = 5;

    @Override
    public double calcularComissao() {
        return  preco * comissao / 100;
    }

    public Carro(String fabricante, String placa, int preco, String cor) {
        this.placa = placa;
        this.preco = preco;
        this.cor = cor;
        this.disponivel = true;
        setFabricante(fabricante);
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public Boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return  getFabricante() + " " + getModelo() + "  " + cor +
                System.lineSeparator() +
                "placa " + placa +
                System.lineSeparator() +
                "preco " + preco +
                System.lineSeparator();
    }
}
