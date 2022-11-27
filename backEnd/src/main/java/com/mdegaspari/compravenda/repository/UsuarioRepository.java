package com.mdegaspari.compravenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdegaspari.compravenda.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

}
