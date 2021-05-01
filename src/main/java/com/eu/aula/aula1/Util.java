package calculadora.projeto.main.aula1;

import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Util {
  /**
   * Escreve um texto no console.
   *
   * @param texto
   */
  public static void escreverTexto(String texto) {
    System.out.println(texto);
  }

  /**
   * Escreve um número inteiro no console.
   *
   * @param numero
   */
  public static void escreverInteiro(int numero) {
    System.out.println(numero);
  }

  /**
   * Lê um número inteiro do usuário.
   *
   * @param mensagem mensagem mostrada ao usuário.
   * @return número inteiro informado pelo usuário.
   */
  public static int lerInteiro(String mensagem) {
    return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
  }

  /**
   * Mostra uma ou mais opções para o usuário que poderá escolher apenas uma das opções.
   *
   * @param mensagem mensagem mostrada ao usuário.
   * @param opcoes   lista de opções a ser mostrada ao usuário, deve ser informada na ordem desejada. Exemplo:
   *                 "maçã","banana","pêra"
   * @return O número da opção selecionada pelo usuário. Exemplo: retorna 1 se o usuário escolher a primeira opção.
   */
  public static int lerOpcaoNumerica(String mensagem, String... opcoes) {
    String[] arr = new String[opcoes.length];
    for (int i = 0; i < opcoes.length; i++) {
      arr[i] = i + 1 + " - " + opcoes[i];
    }
    int x = JOptionPane.showOptionDialog(null, mensagem, "Choose one",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, arr, arr[0]);
    return x + 1;
  }

  /***
   * Calcula quantidade de um determinado dia da semana no mes atual
   * @param numeroDoDiaDaSemana
   *  0-Segunda
   *  1-Terça
   *  2-Quarta
   *  3-Quinta
   *  4-Sexta
   * @return
   */
  public static long calcularQuantidadesDiaDaSemanaNoMes(int numeroDoDiaDaSemana) {
    final DayOfWeek diaDaSemana = parsearDIaDaSemana(numeroDoDiaDaSemana);
    LocalDate firstDay = LocalDate.now().withDayOfMonth(1);
    LocalDate lastDay = firstDay.plusMonths(1);
    long count = firstDay.datesUntil(lastDay).filter(
        d -> d.getDayOfWeek().equals(diaDaSemana))
        .count();
    return count;
  }

  private static DayOfWeek parsearDIaDaSemana(int numeroDoDiaDaSemana) {
    switch (numeroDoDiaDaSemana) {
      case 0:
        return DayOfWeek.MONDAY;
      case 1:
        return DayOfWeek.TUESDAY;
      case 2:
        return DayOfWeek.WEDNESDAY;
      case 3:
        return DayOfWeek.THURSDAY;
      case 4:
        return DayOfWeek.FRIDAY;
      default:
        return null;
    }
  }

}
