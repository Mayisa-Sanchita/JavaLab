package main;

import java.util.Scanner;

public class TicketSeller {
	public static void main(String args[]) {
		int remainingTickets = 100;
		int buyers = 0;
		Scanner input = new Scanner(System.in);
		while (remainingTickets > 0) {
			
			System.out.println("Enter number of tickets you want (Maximum 4): ");
			int desiredTickets = input.nextInt();
			if (desiredTickets > 4) {
				System.out.println("You can buy as many as 4 tickets");
			} else if (remainingTickets >= desiredTickets) {
				remainingTickets = remainingTickets - desiredTickets;
				buyers = buyers + 1;
				System.out.println("Remaining tickets: " + remainingTickets);
			} else {
				System.out.println("Sorry, " + desiredTickets + " is not available");
				System.out.println("Remaining tickets: " + remainingTickets);
			}
		}
		input.close();
		System.out.println("Total number of buyers: " + buyers);
	}
}

