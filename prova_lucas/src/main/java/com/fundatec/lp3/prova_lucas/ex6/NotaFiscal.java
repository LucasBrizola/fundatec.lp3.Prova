package com.fundatec.lp3.prova_lucas.ex6;

import java.util.List;

public class NotaFiscal {
	private String cliente;
	private List<Item> itens;
	private String endereco;
	private double valorTotal;
	

	public static class Builder {
		private String cliente;
		private List<Item> itens;
		private String endereco;
		private double valorTotal;

		public Builder(String cliente) {
			this.cliente = cliente;
		}

		public Builder comEndereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public Builder comItens(List<Item> itens) {
			this.itens = itens;
			return this;
		}

		public NotaFiscal build() {
			NotaFiscal nf = new NotaFiscal();
			nf.cliente = this.cliente;
			nf.endereco = this.endereco;
			nf.itens = this.itens;
			nf.valorTotal = this.valorTotal;
			return nf;
		}
	}

	public String getCliente() {
		return cliente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public String getEndereco() {
		return endereco;
	}

	public double getValorTotal() {
		calculaValorTotal();
		return valorTotal;
	}
	
	public double calculaValorTotal() {
		valorTotal = 0.0;
		for (Item item : itens) {
			valorTotal += item.getValor();
		}
		return valorTotal;
	}
	
	public void adicionarItem(Item item) {
		itens.add(item);
		calculaValorTotal();
	}

	private NotaFiscal() {
	}

}
