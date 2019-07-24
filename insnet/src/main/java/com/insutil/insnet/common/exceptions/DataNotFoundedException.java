package com.insutil.insnet.common.exceptions;

/**
 * @author user
 *
 */
public class DataNotFoundedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4326310574490320048L;
	public DataNotFoundedException() {
		super("data is not founded");
	}
	
	public DataNotFoundedException(final String msg) {
		super(msg);
	}
}
