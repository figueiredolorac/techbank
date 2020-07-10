package br.com.techbank.test.io;

import br.com.techbank.ModeloBanco.Cliente;
import br.com.techbank.ModeloBanco.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Julia");
        cliente.setProfissao("Tecnica");
        cliente.setCpf("741.526.986.78");

        ContaCorrente cc = new ContaCorrente(547,6589-5);
        cc.setTitular(cliente);
        cc.deposita(358.4);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
