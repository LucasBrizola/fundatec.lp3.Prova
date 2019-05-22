package com.fundatec.lp3.prova_lucas.ex4;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Empregado {
	private String empregadoId;
	private String nome;
	private String endereco;
	private Date dataDeAdmissao;
	private Double salario;
	private Imposto imposto;
	private Promocao promocao;
	
	Date date = new Date();
	LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	private int year  = localDate.getYear();
	private int month = localDate.getMonthValue();
	private int day   = localDate.getDayOfMonth();
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getEmpregadoId() {
		return empregadoId;
	}

	public void setEmpregadoId(String empregadoId) {
		this.empregadoId = empregadoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public Promocao getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}

}
