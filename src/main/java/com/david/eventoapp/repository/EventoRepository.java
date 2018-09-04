package com.david.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.david.eventoapp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
