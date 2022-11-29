package com.mdegaspari.compravenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mdegaspari.compravenda.model.VendasModel;
import com.mdegaspari.compravenda.services.VendasService;

@RestController
@RequestMapping(value = "/usuarios")
public class VendasController {

	@Autowired
	private VendasService service;
	
	@GetMapping
	public Page<VendasModel> findVendas(
				@RequestParam(value="minDate", defaultValue = "") String minDate,
				@RequestParam(value="maxDate", defaultValue = "") String maxDate,
				Pageable pageable){
		return service.findVendas(minDate, maxDate, pageable);
	}
	
}
