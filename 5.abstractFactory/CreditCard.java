package abstractFactory;

public abstract class CreditCard {
	
	protected int cardNumberLength;
	
	protected int scvNumber;

	public int getCardNumberLength() {
		return cardNumberLength;
	}

	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}

	public int getScvNumber() {
		return scvNumber;
	}

	public void setScvNumber(int scvNumber) {
		this.scvNumber = scvNumber;
	}
	

}
