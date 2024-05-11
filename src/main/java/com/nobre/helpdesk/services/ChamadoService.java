package com.nobre.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nobre.helpdesk.domain.Chamado;
import com.nobre.helpdesk.repositories.ChamadoRepository;
import com.nobre.helpdesk.services.exception.ObjectnotFoundException;

@Service
public class ChamadoService {
	
	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado ID: " + id));
	}
	
	public List<Chamado> findAll(){
		return repository.findAll();
	}

}
