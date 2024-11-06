package br.com.edercasagranda.AP2Spring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
  private int id;
  private String nome;
  private int idade;
  private String profissao;

  //------------------- para fazer alterações nos clientes ---------------------------------

  public void setAll(String nome, int idade, String profissao){

    this.nome = nome;
    this.idade = idade;
    this.profissao = profissao;


  } //NÃO PRECISA passar o id porque ele NÃO vai ser alterado, somente os dados do cliente
}
