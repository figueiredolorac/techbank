package br.com.techbank.TesteBanco;

import br.com.techbank.ModeloBanco.ContaCorrente;
import br.com.techbank.ModeloBanco.ContaPoupanca;
import br.com.techbank.ModeloBanco.SacaException;

public class TestaContas_v2 {

    public static void main(String[] args) throws SacaException {
        ContaCorrente cc = new ContaCorrente(1234, 56478-2);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(2345, 69874-5);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
