package test;

import static org.junit.Assert.*;

import cz.tieto.weather.business.BadClass;

public class Test {

	@org.junit.Test
	public void test() {
		new BadClass().go();
		assertEquals(true, true);
	}

}
