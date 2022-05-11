package br.unicamp.ic.inf335.test;






import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.ProdutoBean;


public class ProdutoBeanTest {

	@Test
	public void compareToSmaller() {
		ProdutoBean pOne = new ProdutoBean("P01", "ProdutoUm", "Produto Usado", 100.00, "Usado");
		ProdutoBean pTwo = new ProdutoBean("P02", "ProdutoDois", "Produto Usado", 99.00, "Usado");
		Assertions.assertEquals(-1, pTwo.compareTo(pOne));
	}
	
	@Test
	public void compareToBigger() {
		ProdutoBean pOne = new ProdutoBean("P01", "ProdutoUm", "Produto Usado", 100.00, "Usado");
		ProdutoBean pTwo = new ProdutoBean("P02", "ProdutoDois", "Produto Usado", 99.00, "Usado");
		Assertions.assertEquals(1, pOne.compareTo(pTwo));
	}
	
	@Test
	public void compareToEquals() {
		ProdutoBean pOne = new ProdutoBean("P01", "ProdutoUm", "Produto Usado", 100.00, "Usado");
		ProdutoBean pTwo = new ProdutoBean("P02", "ProdutoDois", "Produto Usado", 100.00, "Usado");
		Assertions.assertEquals(0, pOne.compareTo(pTwo));
	}
}
