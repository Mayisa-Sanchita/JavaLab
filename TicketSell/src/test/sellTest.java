package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.TicketSeller;
import main.TicketSellers;

class sellTest {
	TicketSellers tS=new TicketSellers();
	@Test
	void test() {
		assertEquals(50,tS.sellTicket(50),"");
		assertEquals(40,tS.sellTicket(10),"");
		assertEquals(30,tS.sellTicket(10),"");
		assertEquals(10,tS.sellTicket(20),"");
		
	}

}
