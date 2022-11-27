package com.mdegaspari.compravenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdegaspari.compravenda.model.UsuarioModel;
import com.mdegaspari.compravenda.repository.UsuarioRepository;

@Service // registrando o UsuarioSevice como um componente do sistema
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public List<UsuarioModel> findUsuario() {
		return	repo.findAll();
			
	}

}
