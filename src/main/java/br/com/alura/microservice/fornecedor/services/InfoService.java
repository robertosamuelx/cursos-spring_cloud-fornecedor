package br.com.alura.microservice.fornecedor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.models.InfoFornecedor;
import br.com.alura.microservice.fornecedor.repositories.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}
}
