package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Loja {
    private String bairro;
    private String cidade;
    private Set<Carro> estoque = new LinkedHashSet<>();

    public Loja(String bairro, String cidade) {
        this.bairro = bairro;
        this.cidade = cidade;
    }

    private Set<Vendedor> vendedores = new HashSet<>();

        //Setters and Getters

        public String getCidade() {
            return cidade;
        }
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
        public String getBairro() {
            return bairro;
        }
        public void setBairro(String bairro) {
            this.bairro = bairro;
        }
        public Set<Carro> getEstoque() {
            return estoque;
        }
        public void setEstoque(Set<Carro> estoque) {
            this.estoque = estoque;
        }

    public Set<Vendedor> getVendedores() {
            return vendedores;
        }

    public void setVendedores(Set<Vendedor> vendedores) {
            this.vendedores = vendedores;
        }

    @Override
    public int hashCode() {
           return Objects.hash(cidade,bairro,estoque);
    }

    @Override
    public String toString() {
        return "Loja{" +
                "bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estoque=" + estoque +
                ", vendedores=" + vendedores +
                '}';
    }
}



