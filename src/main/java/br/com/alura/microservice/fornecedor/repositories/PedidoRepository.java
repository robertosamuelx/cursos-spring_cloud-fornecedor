package br.com.alura.microservice.fornecedor.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.microservice.fornecedor.models.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer>{

}
