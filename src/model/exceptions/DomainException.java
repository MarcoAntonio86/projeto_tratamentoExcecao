package model.exceptions;
//o copilador obriga tratar a Exception, se fosse RunTimeException não, são classes nativas

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
