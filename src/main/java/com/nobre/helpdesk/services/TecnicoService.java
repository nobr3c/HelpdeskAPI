package com.nobre.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nobre.helpdesk.domain.Tecnico;
import com.nobre.helpdesk.repositories.TecnicoRepository;
import com.nobre.helpdesk.services.exception.ObjectnotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto Não Encontrado! Id: " + id));
	}

	public List<Tecnico> findAll() {
		return repository.findAll();
	}
}
