package br.com.techbank.TesteEmpresa;

import br.com.techbank.ModeloEmpresa.ControleBonificacao;
import br.com.techbank.ModeloEmpresa.Designer;
import br.com.techbank.ModeloEmpresa.EditorVideo;
import br.com.techbank.ModeloEmpresa.Gerente;

public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marisa");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());

    }
}