package model.domain;

import org.junit.Test;

public class TestPostOilProductForSale {

	@Test
	public void testCreateProductForSale(){
		long start = System.currentTimeMillis();
		
		GenericProduct product = new GasolineBO();
		
		long end = System.currentTimeMillis();
		System.out.println("DEBUG: start " + start + " end " + end);
	}
	
	@Test
	public void testRetrieveProductForSale(){
		
	}
	
	@Test
	public void testPostProductForSale(){
		
	}
}
