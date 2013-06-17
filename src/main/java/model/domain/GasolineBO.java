package model.domain;

public class GasolineBO extends GenericProduct {

	public GasolineBO(){}
	
	public GasolineBO(String productName){
		super.setProductName(productName);
	}
	
	@Override
	public String showProductDescription() {
		return super.getProductName();
	}
	
}
