package br.com.techbank.TesteEmpresa;

import br.com.techbank.ModeloEmpresa.Administrador;
import br.com.techbank.ModeloEmpresa.ClienteEmpresa;
import br.com.techbank.ModeloEmpresa.Gerente;
import br.com.techbank.ModeloEmpresa.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(3081);

        Administrador adm = new Administrador();
        adm.setSenha(3187);

        ClienteEmpresa cliente = new ClienteEmpresa();
        cliente.setSenha(3081);

        SistemaInterno si = new SistemaInterno();

        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);
        
    }
}