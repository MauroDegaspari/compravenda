package com.mdegaspari.compravenda.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mdegaspari.compravenda.model.VendasModel;
import com.mdegaspari.compravenda.repository.VendasRepository;

@Service // registrando o UsuarioSevice como um componente do sistema
public class VendasService {
	
	@Autowired
	private VendasRepository repo;
	
	public Page<VendasModel> findVendas(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate min = LocalDate.parse(minDate);
		LocalDate max = LocalDate.parse(maxDate);
		
		return	repo.findVendas(min, max, pageable);
		
		
			
	}
	
//	public Page	<UsuarioModel> RetornaSenhaUsuario(int paramentro, Pageable pageable){
//		return repo.SenhaUsuario(paramentro);
//	}

}
