import java.math.BigDecimal;


public class Transfer {

	private String name;
	private String surname;
	private String destination;
	private String source;
	private String currency;
	private BigDecimal amount;
	
	 /**
	 * @param line One line from file eg. 
	 * "@name:Jan@surname:Kowalski@src_iban:84063099651078062132711059@dst_iban:16612843863420872434731304@amount:12,34PLN"
	 */
	public Transfer(String line){
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}	
	
}
