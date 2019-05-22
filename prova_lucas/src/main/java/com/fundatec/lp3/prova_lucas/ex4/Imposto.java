package com.fundatec.lp3.prova_lucas.ex4;

public class Imposto implements RegraImposto {

	public double calculaImpostoParaAnoCorrente(Empregado empregado) {
		if (empregado.getSalario() > 3000.0) {
			return empregado.getSalario() * 0.8;
		} else {
			return empregado.getSalario() * 0.9;
		}
	}
}