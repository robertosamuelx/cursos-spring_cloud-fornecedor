package br.com.alura.microservice.fornecedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.models.Produto;
import br.com.alura.microservice.fornecedor.repositories.ProdutoRepository;

@Service
public class ProdutoService {

        @Autowired
        private ProdutoRepository produtoRepository;

        public List<Produto> getProdutosPorEstado(String estado) {
                return produtoRepository.findByEstado(estado);
        }


}
