package br.com.techbank.test.io;

import br.com.techbank.ModeloBanco.Conta;
import br.com.techbank.ModeloBanco.ContaCorrente;

import java.awt.desktop.SystemEventListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();

        ois.close();

        System.out.println(cc.getSaldo());
        System.out.println(cc.getTitular().getNome());
    }
}
