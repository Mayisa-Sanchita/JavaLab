package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.SpeedCalculate;

class SpeedTest {
	SpeedCalculate sCalc = new SpeedCalculate();
	@Test
	void test() {
		assertEquals(10,sCalc.calculateSpeed(1.0),"Ok");
		assertEquals(40,sCalc.calculateSpeed(0.1),"Ok");
	}

}
