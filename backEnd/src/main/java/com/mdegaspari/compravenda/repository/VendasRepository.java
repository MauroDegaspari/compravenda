package com.mdegaspari.compravenda.repository;



import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mdegaspari.compravenda.model.UsuarioModel;
import com.mdegaspari.compravenda.model.VendasModel;

public interface VendasRepository extends JpaRepository<UsuarioModel, Integer> {
	
//	@Query(value= "SELECT cd_usuario"
//			     + " FROM usuario "
//			     + " WHERE cd_usuario = :paramentro"
//			     , nativeQuery = true)
//	public List<UsuarioModel> SenhaUsuario(@Param("paramentro") int paramentro);
	
	
	@Query( " SELECT vm, um"
	      + " FROM VendasModel vm, UsuarioModel um"
	      + " WHERE vm.data_venda  BETWEEN :min AND :max"
	      + " AND vm.usuario = um.usuario"
	      + " ORDER BY vm.codigo_venda DESC")
	public Page<VendasModel> findVendas(LocalDate min, LocalDate max, Pageable pageable);

}
