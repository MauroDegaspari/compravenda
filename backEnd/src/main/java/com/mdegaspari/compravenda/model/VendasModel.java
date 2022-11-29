package com.mdegaspari.compravenda.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="venda")
public class VendasModel {
	
	@Id
	@Column(name="cd_venda")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int codigo_venda;
	
	@Column(name="DT_VENDA")
    private LocalDate data_venda;
	
	@Column(name="QT_VISITAS")
    private int qt_vistas; 
	
	@Column(name="QT_VENDAS")
    private int qt_vendas;
	
	@Column(name="TOTAL")
    private double total;
	
	@ManyToOne
	@JoinColumn(name="cd_usuairo" )
    private UsuarioModel usuario;
	
    
   
	public int getCodigo_venda() {
		return codigo_venda;
	}
	public void setCodigo_venda(int codigo_venda) {
		this.codigo_venda = codigo_venda;
	}
	public LocalDate getData_venda() {
		return data_venda;
	}
	public void setData_venda(LocalDate data_venda) {
		this.data_venda = data_venda;
	}
	public int getQt_vistas() {
		return qt_vistas;
	}
	public void setQt_vistas(int qt_vistas) {
		this.qt_vistas = qt_vistas;
	}
	public int getQt_vendas() {
		return qt_vendas;
	}
	public void setQt_vendas(int qt_vendas) {
		this.qt_vendas = qt_vendas;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
    
	 public UsuarioModel getUsuario() {
			return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
	 	this.usuario = usuario;
	}
    
    

}


