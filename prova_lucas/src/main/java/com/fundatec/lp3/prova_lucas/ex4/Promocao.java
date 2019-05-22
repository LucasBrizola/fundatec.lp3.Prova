package com.fundatec.lp3.prova_lucas.ex4;

public class Promocao {

	public boolean temPromocaoEsteAno(Empregado empregado) {
		if(empregado.getYear() == 5) {
			return true;
		}
		else {
			return false;
		}
	}
}
