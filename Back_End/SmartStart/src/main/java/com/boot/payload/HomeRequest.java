package com.boot.payload;


public class HomeRequest {
	
	private String morada;
	
	private int area;
	
	private int ano;
	
	private String topologia;
	
	private double capitalImovel;
	

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTopologia() {
		return topologia;
	}

	public void setTopologia(String topologia) {
		this.topologia = topologia;
	}

	public double getCapitalImovel() {
		return capitalImovel;
	}

	public void setCapitalImovel(double capitalImovel) {
		this.capitalImovel = capitalImovel;
	}
	
}
