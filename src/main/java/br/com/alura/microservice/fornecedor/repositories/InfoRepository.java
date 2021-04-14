package br.com.alura.microservice.fornecedor.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.models.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Integer>{

	InfoFornecedor findByEstado(String estado);
}
