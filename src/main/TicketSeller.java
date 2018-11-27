package main;
import java.util.Scanner;
public class TicketSeller {
	private final int MAX_TICKET = 100;
	private int soldT = 0;
	private int buyer;
	private boolean haveTicket = true;
	
	public boolean OperateBuy(int x) {
		if(soldT+x > MAX_TICKET) {
			haveTicket = false;
		}
		else {
			soldT = soldT + x;
			buyer++;
		}
		return haveTicket;
	}
	
	public void reset() { 
		buyer = 0;
		soldT = 0;
	}
	
	public int getSoldTickets() {
		return soldT;
	}
	public int getBuyer() {
		return buyer;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = 0;
		TicketSeller ob = new TicketSeller ();
		while(true) {
			System.out.println("1.Enter 0 for quit\n2.How many tickes want to buy?\n");
			t = in.nextInt();
			if(ob.OperateBuy(t)) {
				System.out.println("Buyer Number: " + ob.getBuyer());
				System.out.println("Total Sold: " + ob.getSoldTickets());
			}
			else {
				System.out.println("Ticket are not available");
			}
		}
	}
}