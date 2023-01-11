import br.com.dio.desafio.dominio.*;

public class Main {

    public static void main(String[] args) {

        //Input das lojas
        Loja loja1 = new Loja("Tijuca","Rio de janeiro");
        Loja loja2 = new Loja("Centro","Fortaleza");

        //Input carros
        Carro car1 = new Carro("Ford","RHG4A78",80000,"Branco");
        car1.setModelo("EcoSport");
        Carro car2 = new Carro("Honda","PTY4A99",230000,"Preto" );
        car2.setModelo("HRV");
        Carro car3 = new Carro("Honda", "HUY4A89",130000, "Prata");
        car3.setModelo("FIT");

        //Input Vendedores
        Vendedor vend1 = new Vendedor("Ceeh");
        Vendedor vend2 = new Vendedor("Paulo");
        Vendedor vend3 = new Vendedor("Ana");

        //Adicionando carros ao estoque da loja
        loja1.getEstoque().add(car1);
        loja1.getEstoque().add(car2);
        loja2.getEstoque().add(car3);

        // Def Vendedor
        loja1.getVendedores().add(vend1);
        loja1.getVendedores().add(vend2);
        loja2.getVendedores().add(vend3);

        // Vender carros
        vend1.venderCarro(car1);
        vend1.venderCarro(car2);
        vend2.venderCarro(car1); //Não permite vender carro1, pois já foi vendido.
        vend2.venderCarro(car3);

        System.out.println("*************************************************");
        System.out.println("Vendas");
        System.out.println("*************************************************");
        vend1.saida();
        vend2.saida();
        System.out.println("*************************************************");
        System.out.println("Vendas");
        System.out.println("*************************************************");
        System.out.println(vend1.getNome() + "    " + vend1.getComissao());
        System.out.println(vend2.getNome() + "    " + vend2.getComissao());
        System.out.println(vend3.getNome() + "    " + vend3.getComissao());

        //String cor =  car1.getCor();
        //System.out.println("Loja -------------");
        //System.out.println(loja1);

    }
}