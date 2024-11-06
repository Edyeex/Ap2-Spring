package br.com.edercasagranda.AP2Spring.repositories;

import br.com.edercasagranda.AP2Spring.models.Cliente;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
  private List<Cliente> clientes = new ArrayList<>();

  public List<Cliente> getClientes(){
	return clientes;
  }


  public Cliente criarCliente(Cliente cliente){

	if (buscarClientesPorId(cliente.getId()) != null) {
	  return null;
	}
	clientes.add(cliente);
	return cliente;

  } // Não vai criar um cliente com o mesmo Id, sempre Ids diferentes

  public Cliente deletarClientes(int id){

	Cliente cliente = buscarClientesPorId(id);
	if (cliente != null){
	  clientes.remove(cliente);
	  return cliente;
	}
	return null;

  }// vai remover o cliente se ele não for nulo/se ele existe

  public Cliente atualizarCliente(int id, Cliente clienteAtualizado) {

	Cliente cliente = buscarClientesPorId(id);
	cliente.setAll(clienteAtualizado.getNome(), clienteAtualizado.getIdade(), clienteAtualizado.getProfissao());
	return cliente;

  }

  public Cliente buscarClientesPorId(int id) {

	for (Cliente cliente : clientes) {
	  if (cliente.getId() == id) {
		return cliente;
	  }
	}
	return null;

  }// provavelmente é pra não retornar nada se buscar por um id que não existe

  // não fiz as respostas pra se não tiver nenhum cliente...

}
