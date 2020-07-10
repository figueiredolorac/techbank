package br.com.techbank.ModeloBanco;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 *
 * @author Caroline Figueiredo
 *
 */


public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     * @param agencia
     * @param numero
     */

    public Conta(final int agencia, final int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

        /**
    * Valor precisa ser menor ou igual ao saldo
    * @param valor 
    * @throws SacaException
    */

    public void saca(final double valor) throws SacaException {
        if (this.saldo < valor) {
            throw new SacaException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(final double valor , final Conta destino) throws SacaException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(final int numero) {
        if(numero <= 0) {
            System.out.println("Nao pode valor menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia){
            return false;
        }

        if(this.numero != outra.numero){
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
    }
}
