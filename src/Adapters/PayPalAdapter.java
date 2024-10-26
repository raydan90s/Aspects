package Adapters;
import Interfaces.*;
import Classes.*;

public class PayPalAdapter implements PaymentProcesor{
	private PayPal payPal;
	
	public PayPalAdapter(PayPal payPal) {
		this.payPal = payPal;
	}
	
	public void processPayment(double amount) {
		payPal.sendPayment(amount);
	}
	
}
