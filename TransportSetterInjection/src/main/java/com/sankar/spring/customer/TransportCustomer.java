package com.sankar.spring.customer;

import com.sankar.spring.contract.Transport;

public class TransportCustomer {

	private Transport transport;
	
	public TransportCustomer() {
	}
	public TransportCustomer(Transport transport) {
		this.transport = transport;
	}
	
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	public void useTransport() { 
		transport.doTravel ();
	}
	
	
}
