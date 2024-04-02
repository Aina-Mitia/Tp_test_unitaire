package fr.emse.test;
import fr.emse.test.MoneyBag;

public class Money implements IMoney {

	private int fAmount;
	private String fCurrency;
	public Money(int amount, String currency) {
	fAmount = amount;
	fCurrency = currency;
	}
	public int amount() {
	return fAmount;
	}
	public String currency() {
	return fCurrency;
	}
	public Money add(Money m) {
	return new Money(amount() + m.amount(), currency());
	}
	
	public IMoney add(IMoney m) {
		return m.addMoney(this);
		}

	
	/*public Money add(Money m) {
		if (m.currency().equals(currency()))
		return new Money(amount() + m.amount(), currency());
		return new MoneyBag(this, m);
		}*/
	public boolean equals(Object obj) {
		if (obj instanceof Money) {
            // Convertir l'objet en Money
            Money other = (Money) obj;
		if(this.amount()==other.amount() && this.currency()== other.currency() && this!= null) {
			return true;
		} else return false;
		} else return false;
	}
	
	
	
}
