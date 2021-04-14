package br.com.alura.microservice.fornecedor.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.models.InfoFornecedor;
import br.com.alura.microservice.fornecedor.services.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	Logger log = LoggerFactory.getLogger(InfoController.class);

	@GetMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
		log.info(String.format("recebido pedido de informações do fornecedor de %s", estado));
		return infoService.getInfoPorEstado(estado);
	}
}
