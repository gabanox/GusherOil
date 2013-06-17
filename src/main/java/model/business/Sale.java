package model.business;

import model.domain.GenericProduct;


public class Sale {

	private GenericProduct product = null;

	public Sale(){}
	
	public Sale(GenericProduct product){
		this.product = product;
	}

	public GenericProduct getProduct() {
		return product;
	}

	public void setProduct(GenericProduct product) {
		this.product = product;
	}
	
}
