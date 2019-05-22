package com.fundatec.lp3.prova_lucas.ex6;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


public class NotaFiscalTest {

	@Test
	public void deveCriarNotaFiscal() {
		ArrayList<Item> itens = new ArrayList<Item>();
		Item cadeira = new Item("cadeira", 50.0);
		Item mesa = new Item("mesa", 80.0);
		itens.add(cadeira);
		itens.add(cadeira);
		itens.add(cadeira);
		itens.add(cadeira);
		itens.add(mesa);
		
		NotaFiscal nf = new NotaFiscal.Builder("Lucas").comEndereco("Avenida Ipiranga").comItens(itens).build();
		Assert.assertEquals("Lucas", nf.getCliente());
		Assert.assertEquals("Avenida Ipiranga", nf.getEndereco());
		Assert.assertEquals(280.0, nf.getValorTotal(),0);
	}
}
