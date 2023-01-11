package br.com.dio.desafio.dominio;
//Test
// Classe mãe

public abstract class Modelo {

    private String fabricante;
    private String modelo;

    public abstract double calcularComissao();

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {

        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
