package br.com.edercasagranda.AP2Spring.services;

import br.com.edercasagranda.AP2Spring.models.Cliente;
import br.com.edercasagranda.AP2Spring.repositories.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BuscaClienteService {
  final ClienteRepository clienteRepository;

  public BuscaClienteService(ClienteRepository clienteRepository) {
	this.clienteRepository = clienteRepository;
  }

  public List<Cliente> buscarClientes(){
	return clienteRepository.getClientes();
  };

  public void deletarCliente(int id){
	clienteRepository.deletarClientes(id);

  }

  public Cliente atualizarCliente(int id, Cliente cliente){
	return clienteRepository.atualizarCliente(id, cliente);
  }

  public Cliente buscarClientesPorId(int id){   // tu tava com atualizarid e buscarporid fazendo a mesma coisa
	return clienteRepository.buscarClientesPorId(id);
  }

  public Cliente criarCliente(Cliente cliente) {  // aqui tinha que adiconar um return, não pode ser void, se for void não vai ter retorno
	return clienteRepository.criarCliente(cliente);
  }
}

// Nada de mais, só entregas
