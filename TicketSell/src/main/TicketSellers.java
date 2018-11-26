package main;

public class TicketSellers {
	private int max=100;
	private int remainingTicket=100;
	private int buyers = 0;
	
	public int sellTicket(int number) {
		if(number> max) {
			return remainingTicket;
		}else if(number<=remainingTicket) {
			remainingTicket = remainingTicket-number;
			buyers=buyers+1;
		}
		return remainingTicket;
	}
}
