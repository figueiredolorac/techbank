package br.com.techbank.TesteBanco;

import br.com.techbank.ModeloBanco.ContaCorrente;
import br.com.techbank.ModeloBanco.CalculadorDeImposto;
import br.com.techbank.ModeloBanco.SeguroDeVida;
import br.com.techbank.ModeloBanco.Tributavel;

public class TesteTributaveis{

    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registra((Tributavel) cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}