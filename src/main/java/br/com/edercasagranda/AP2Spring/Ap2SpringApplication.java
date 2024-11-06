package br.com.edercasagranda.AP2Spring;

import br.com.edercasagranda.AP2Spring.models.Cliente;
import br.com.edercasagranda.AP2Spring.repositories.ClienteRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ap2SpringApplication {
  final	ClienteRepository clienteRepository;
  public Ap2SpringApplication(ClienteRepository clienteRepository){
	this.clienteRepository = clienteRepository;
  }
  public static void main(String[] args) {
	SpringApplication.run(Ap2SpringApplication.class, args);
  }

  @PostConstruct
  void popularMinhaLista(){

	clienteRepository.criarCliente(new Cliente(1999, "Eder", 25, "Analista de sistemas"));
	clienteRepository.criarCliente(new Cliente(4531, "Vitoria", 29, "Servidora publica"));
	clienteRepository.criarCliente(new Cliente(1023, "Guilherme", 20, "Autonomo"));
	clienteRepository.criarCliente(new Cliente(2002, "Erica", 22, "Corredora de maratona"));

  } // Algumas listas já adicionadas, só pra ter algo

}
