package com.studytrails.tutorials.springautowireannotationnamedjsr330;

import javax.inject.Inject;
import javax.inject.Named;

public class ATM {

	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}
	@Inject
	@Named("printer")
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void printBalanceInformation(String accountNumber) {
		getPrinter().printBalanceInformation(accountNumber);

	}

}
