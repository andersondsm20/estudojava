package org.example.operadores;
public class OperdoresLogicos {
    public static void main(String[] args) {
        System.out.println("=====================================================");

        boolean usuarioVIP = true;
        boolean compraComValorAlto = true;
        boolean menorDeIdade = true;
        boolean temProdutoAlcoolicoNoCarrinho = true;

        System.out.println("Usuário é VIP? " + usuarioVIP);
        System.out.println("A compra tem um valor alto? " + compraComValorAlto);
        System.out.println("É menor de idade? " + menorDeIdade);
        System.out.println("Tem produto alcoólico no carrinho? " + temProdutoAlcoolicoNoCarrinho);

        System.out.println("====================================================");

        boolean aplicarDesconto = usuarioVIP && compraComValorAlto;
        System.out.println("O desconto deve ser aplicado? " + aplicarDesconto);

        aplicarDesconto = usuarioVIP || compraComValorAlto;
        System.out.println("O desconto deve ser aplicado? " + aplicarDesconto);

        boolean permiteConcluirCompra = !menorDeIdade || temProdutoAlcoolicoNoCarrinho;
        System.out.println("Pode conluir compra? " + permiteConcluirCompra);

        System.out.println("Fim!");
        System.out.println("=====================================================");

    }
}
