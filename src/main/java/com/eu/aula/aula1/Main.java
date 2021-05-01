package calculadora.projeto.main.aula1;


import static calculadora.projeto.main.aula1.Util.escreverTexto;
import static calculadora.projeto.main.aula1.Util.lerInteiro;

public class Main {


  public static void main(String[] args) {


    //CalcularComissao();



  }

  private static void CalcularComissao() {
    Integer Preço = lerInteiro("Informar Preço");
    Integer Quantidade = lerInteiro("Informar Quantidade");
    Double Comissão = 0.1;
    Double ComissãoSuperMeta = 0.2;
    Integer Faturamento = Preço * Quantidade;

    escreverTexto("Faturameto R$" + Faturamento);
    if (Faturamento < 200) {
      escreverTexto("Comissão Vendedor = 0");
    } else if (Faturamento >= 200 & Faturamento < 500) {
      Double ComissãoVendedor = Faturamento * Comissão;
      escreverTexto("Comissão Vendedor R$" + ComissãoVendedor);
    } else {
      Double ComissãoVendedorSuperMeta = Faturamento * ComissãoSuperMeta;
      escreverTexto("Comissão Vendedor R$" + ComissãoVendedorSuperMeta);
    }
  }


}
