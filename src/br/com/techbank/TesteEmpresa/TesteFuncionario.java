package br.com.techbank.TesteEmpresa;

import br.com.techbank.ModeloEmpresa.Funcionario;
import br.com.techbank.ModeloEmpresa.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario Julia = new Gerente();
        Julia.setNome("Julia Dias");
        Julia.setCpf("1587321574-0");
        Julia.setSalario(2600.00);

        System.out.println(Julia.getNome());
        System.out.println(Julia.getBonificacao());
    }
}