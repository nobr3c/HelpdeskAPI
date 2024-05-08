package com.nobre.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.nobre.helpdesk.domain.Chamado;
import com.nobre.helpdesk.domain.Cliente;
import com.nobre.helpdesk.domain.Tecnico;
import com.nobre.helpdesk.domain.enums.Perfil;
import com.nobre.helpdesk.domain.enums.Prioridade;
import com.nobre.helpdesk.domain.enums.Status;
import com.nobre.helpdesk.repositories.ChamadoRepository;
import com.nobre.helpdesk.repositories.ClienteRepository;
import com.nobre.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "6365320268", "valir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Cha", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
