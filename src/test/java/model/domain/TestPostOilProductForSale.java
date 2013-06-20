package model.domain;

import junit.framework.TestCase;
import model.business.Sale;

import org.junit.Test;

public class TestPostOilProductForSale extends TestCase{

	@Test
	public void testCreateProductForSale(){
		long start = System.currentTimeMillis();
		
		GenericProduct product = new GasolineBO();
		
		Sale sale = new Sale();
			sale.addProductForSale(product);
		
			/*
			 * Assertions 
			 */
			
			assertNotNull(sale);
			assertNotNull(product);
			assertTrue(sale.getProduct() != null);
			
			
		long end = System.currentTimeMillis();
		System.out.println("DEBUG: execution time " + (end - start) + " miliseconds");
	}
	
	@Test
	public void testRetrieveProductForSale(){
		
	}
	
	@Test
	public void testPostProductForSale(){
		
	}
}
