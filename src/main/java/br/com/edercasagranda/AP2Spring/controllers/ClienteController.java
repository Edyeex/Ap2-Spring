package br.com.edercasagranda.AP2Spring.controllers;


import br.com.edercasagranda.AP2Spring.models.Cliente;
import br.com.edercasagranda.AP2Spring.services.BuscaClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes") // Para todos terem um cliente antes
public class ClienteController {
  final BuscaClienteService service;

  public ClienteController(BuscaClienteService service){
    this.service = service;
  }

  @GetMapping
  public List<Cliente> getClientes(){
    return service.buscarClientes();
  } // Retorna a lista


  @GetMapping("/{id}")
  public Cliente getCliente(@PathVariable int id){
    return service.buscarClientesPorId(id);
  } // Seleciona por Id

  @DeleteMapping("/{id}")
  public void deletarCliente(@PathVariable int id){
    service.deletarCliente(id);
  } // Sem retorno

  @PostMapping
  public Cliente criarCliente(@RequestBody Cliente cliente){
    service.criarCliente(cliente);
    return cliente;
  }// como isso funciona?, ao passar dentro da body a tua criacao,
  // ele vai criar, mas lembre que tem que passar no mesmo formato/ordem de como está os outros

  @PutMapping("/{id}")
  public Cliente atualizarCliente(@PathVariable int id, @RequestBody Cliente cliente){
    service.atualizarCliente(id, cliente);
    return service.atualizarCliente(id, cliente);
  }

}
