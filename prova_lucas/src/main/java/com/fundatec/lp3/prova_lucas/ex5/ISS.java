package com.fundatec.lp3.prova_lucas.ex5;

public class ISS implements Imposto, NotaImposto{
	public double imposto(double valorCheio) {
		return 0.1 * valorCheio;
	}
	public NotaFiscal geraNota() {
		return new NotaFiscal();
	}
}

