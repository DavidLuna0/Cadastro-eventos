package com.david.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.david.eventoapp.model.Convidado;
import com.david.eventoapp.model.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

	Iterable <Convidado> findByEvento(Evento evento);
	Convidado findById(long id);
		
	}

