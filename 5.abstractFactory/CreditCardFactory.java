package abstractFactory;

//abstract factory 
public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		
		if(creditScore>650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}

	//factory of factories
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);
}
