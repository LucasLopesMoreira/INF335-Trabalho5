package br.unicamp.ic.inf335.test;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;


public class AnuncioBeanTest {

	@Test
	public void getValue_zero_percent() {
		ProdutoBean pOne = new ProdutoBean();
		pOne.setValor(100.00);
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(pOne);
		anuncio.setDesconto(0.0);
		
		Assertions.assertEquals(100.00, anuncio.getValor());
			
	}
	
	@Test
	public void getValue_one_percent() {
		ProdutoBean pOne = new ProdutoBean();
		pOne.setValor(100.00);
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(pOne);
		anuncio.setDesconto(0.01);
		
		Assertions.assertEquals(99.00, anuncio.getValor());
	}
	
	@Test
	public void getValue_ninety_nine_percent() {
		ProdutoBean pOne = new ProdutoBean();
		pOne.setValor(100.00);
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(pOne);
		anuncio.setDesconto(0.99);
		
		Assertions.assertEquals(1.00, anuncio.getValor());
	}
	
	@Test
	public void getValue_one_hundred_percent() {
		ProdutoBean pOne = new ProdutoBean();
		pOne.setValor(100.00);
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(pOne);
		anuncio.setDesconto(1.00);
		
		Assertions.assertEquals(0.00, anuncio.getValor());
	}
	
	
}
