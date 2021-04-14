package br.com.alura.microservice.fornecedor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.models.Produto;
import br.com.alura.microservice.fornecedor.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

        @Autowired
        private ProdutoService produtoService;

        @RequestMapping("/{estado}")
        public List<Produto> getProdutosPorEstado(@PathVariable("estado") String estado) {
                return produtoService.getProdutosPorEstado(estado);
        }
}
