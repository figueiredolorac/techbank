package br.com.techbank.TesteBanco;

import br.com.techbank.ModeloBanco.Conta;
import br.com.techbank.ModeloBanco.ContaCorrente;
import br.com.techbank.ModeloBanco.SacaException;

public class TesteSaca {
  public static void main(String[] args) {
      Conta conta = new ContaCorrente(456, 89765);

      conta.deposita(200.0);
      try {
        conta.saca(210.0);
      }catch(SacaException ex) {
        System.out.println(ex.getMessage());
      }
      System.out.println(conta.getSaldo());
  }
}
