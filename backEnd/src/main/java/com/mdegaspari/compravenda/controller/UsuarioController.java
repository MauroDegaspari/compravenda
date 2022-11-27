package com.mdegaspari.compravenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdegaspari.compravenda.model.UsuarioModel;
import com.mdegaspari.compravenda.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuario;
	
	@GetMapping
	public List<UsuarioModel> findUsuario(){
		return usuario.findUsuario();
	}
	
}
