package Classes;
import Interfaces.*;

public class BankTransfer implements PaymentProcesor{
	public void processPayment(double amount) {
		System.out.print("Processing money...");
	}
}
