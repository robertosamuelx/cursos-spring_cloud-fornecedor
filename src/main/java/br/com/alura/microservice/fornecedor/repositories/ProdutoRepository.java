package br.com.alura.microservice.fornecedor.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.microservice.fornecedor.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

        List<Produto> findByEstado(String estado);

        List<Produto> findByIdIn(List<Integer> ids);
}
