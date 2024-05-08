package com.nobre.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nobre.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
