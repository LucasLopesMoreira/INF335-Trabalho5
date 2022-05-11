package br.unicamp.ic.inf335.test;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.AnuncianteBean;
import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;


public class AnuncianteBeanTest {

	@Test
	public void valorMedioAnuncios_zero_elements(){
		AnuncianteBean anun = new AnuncianteBean();
		Assertions.assertEquals(0.0, anun.valorMedioAnuncios());
	}
	
	@Test
	public void valorMedioAnuncios(){
		ProdutoBean pOne = new ProdutoBean("", "", "", 10.00, "");
		ProdutoBean pTwo = new ProdutoBean("", "", "", 10.00, "");
		ProdutoBean pThree = new ProdutoBean("", "", "", 10.00, "");
		ProdutoBean pFor = new ProdutoBean("", "", "", 10.00, "");
		
		AnuncioBean aOne = new AnuncioBean();
		AnuncioBean aTwo = new AnuncioBean();
		AnuncioBean aThree = new AnuncioBean();
		AnuncioBean aFour = new AnuncioBean();
		
		aOne.setProduto(pOne);
		aTwo.setProduto(pTwo);
		aThree.setProduto(pThree);
		aFour.setProduto(pFor);
		
		ArrayList<AnuncioBean> anuncios = new ArrayList<>();
		anuncios.add(aOne);
		anuncios.add(aTwo);
		anuncios.add(aThree);
		anuncios.add(aFour);
		
		AnuncianteBean anun = new AnuncianteBean();
		anun.setAnuncios(anuncios);
		
		Assertions.assertEquals(10.00, anun.valorMedioAnuncios());
	}
	
	@Test
	public void addAnuncio(){
		
		ProdutoBean pOne = new ProdutoBean("", "", "", 10.00, "");
		AnuncioBean aOne = new AnuncioBean();
		aOne.setProduto(pOne);
		
		ArrayList<AnuncioBean> anuncios = new ArrayList<>();
		anuncios.add(aOne);
		
		AnuncianteBean anun = new AnuncianteBean();
		anun.setAnuncios(anuncios);
		
		Assertions.assertEquals(1, anun.getAnuncios().size());
		
	}
	
	@Test
	public void removeAnuncio(){
		
		ProdutoBean pOne = new ProdutoBean("", "", "", 10.00, "");
		ProdutoBean pTwo = new ProdutoBean("", "", "", 10.00, "");
		
		AnuncioBean aOne = new AnuncioBean();
		AnuncioBean aTwo = new AnuncioBean();
		aOne.setProduto(pOne);
		aOne.setProduto(pTwo);
		
		ArrayList<AnuncioBean> anuncios = new ArrayList<>();
		anuncios.add(aOne);
		anuncios.add(aTwo);
		
		AnuncianteBean anun = new AnuncianteBean();
		anun.setAnuncios(anuncios);
		anun.removeAnuncio(0);
		
		Assertions.assertEquals(1, anun.getAnuncios().size());
		
	}
}
