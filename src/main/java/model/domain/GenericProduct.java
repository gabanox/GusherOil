package model.domain;

public abstract class GenericProduct {

	private String productName;
	
	protected String getProductName() {
		return productName;
	}

	protected void setProductName(String productName) {
		this.productName = productName;
	}

	public abstract String showProductDescription();
}
