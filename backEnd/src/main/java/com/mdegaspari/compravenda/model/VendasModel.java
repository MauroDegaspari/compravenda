package com.mdegaspari.compravenda.model;

import java.time.LocalDate;

public class VendasModel {
	
	private int codigo_venda;  
    private LocalDate data_venda;   
    private int qt_vistas;  
    private int qt_vendas;
    private double total;
	
    
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
    
    
    

}


