package test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.TicketSeller;
class Testing {
	TicketSeller ob = new TicketSeller();
	
	@Test
	void testOperateBuy() {
		assertEquals(true, ob.OperateBuy(3), "answer should to be true");
	}
	@Test
	void testReset() {
		fail("Not yet implemented");
	}
	@Test
	void testGetSoldTickets() {
		assertEquals(10, ob.getSoldTickets(), "buyed ticket");
	}
	@Test
	void testGetBuyer() {
		assertEquals(1, ob.getBuyer(), "buyer");
	}
}