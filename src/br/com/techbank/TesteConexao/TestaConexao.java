package br.com.techbank.TesteConexao;

import br.com.techbank.ModeloConexao.*;

public class TestaConexao {
  public static void main(String[] args) {
      try (Conexao conexao = new Conexao()) {
        conexao.leDados();
      } catch(IllegalStateException ex) {
          System.out.println("Deu erro na conexao");
      }
  }
}
