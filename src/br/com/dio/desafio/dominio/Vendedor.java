package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Vendedor {

    //Atributos
    private String nome;
    private double comissao;
    private Set<Carro> carrosVendidos = new LinkedHashSet<>();

    //Getters e Setters
    public Set<Carro> getCarrosVendidos() {
        return carrosVendidos;
    }
    public String getNome() {
        return nome;
    }
    public double getComissao() {
        return comissao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCarrosVendidos(Set<Carro> carrosVendidos) {
        this.carrosVendidos = carrosVendidos;
    }

    // Construtor
    public Vendedor(String nome) {
        this.nome = nome;
    }

    //Métodos
    public void saida(){
        //Output Vendedor1
        System.out.println( "============================================================");
        System.out.println( "Vendedor : " + this.nome);
        System.out.println( "--------------------------------------------------");

        /*System.out.println(vend1.getCarrosVendidos().size());
        for (int i =0; i < vend1.getCarrosVendidos().size(); i++){
            vend1.getCarrosVendidos()
        }*/

        System.out.println( this.carrosVendidos);
        System.out.println( "--------------------------------------------------");
        System.out.println( "Comissao: " + this.comissao);
        System.out.println( "============================================================");
        System.out.println();
        System.out.println();
    }

    public void venderCarro(Carro carro){
        if(carro.getDisponivel()) {
            this.carrosVendidos.add(carro);
            this.comissao = this.comissao + carro.calcularComissao();
            carro.setDisponivel(false);
        }
    }

     @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
