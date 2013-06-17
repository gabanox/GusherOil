package model.domain;

public class BidBO {

	private BuyerBO buyer = null;
	
	private SellerBO seller = null;
	
	private PaymentBO payment = null;
	
	private GasolineBO gasoline = null;
	
	private KeroseneBO kerosene = null;
	
	private LubricatingOilBO lubricatingOil = null;

	public BuyerBO getBuyer() {
		return buyer;
	}

	public void setBuyer(BuyerBO buyer) {
		this.buyer = buyer;
	}

	public SellerBO getSeller() {
		return seller;
	}

	public void setSeller(SellerBO seller) {
		this.seller = seller;
	}

	public PaymentBO getPayment() {
		return payment;
	}

	public void setPayment(PaymentBO payment) {
		this.payment = payment;
	}

	public GasolineBO getGasoline() {
		return gasoline;
	}

	public void setGasoline(GasolineBO gasoline) {
		this.gasoline = gasoline;
	}

	public KeroseneBO getKerosene() {
		return kerosene;
	}

	public void setKerosene(KeroseneBO kerosene) {
		this.kerosene = kerosene;
	}

	public LubricatingOilBO getLubricatingOil() {
		return lubricatingOil;
	}

	public void setLubricatingOil(LubricatingOilBO lubricatingOil) {
		this.lubricatingOil = lubricatingOil;
	}
	
	
}
