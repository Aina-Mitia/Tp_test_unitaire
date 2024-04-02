package fr.emse.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MoneyBagTest.class, MoneyTest.class })
public class AllTests {

	 private Money f12CHF;
	    private Money f14CHF;
	    private Money f7USD;
	    private Money f21USD;
	    private MoneyBag fMB1;
	    private MoneyBag fMB2;
	
	@Test
	public void testMixedSimpleAdd() {
	// [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
	Money bag[] = { f12CHF, f7USD };
	MoneyBag expected = new MoneyBag(bag);
	assertEquals(expected, f12CHF.add(f7USD));
	}
	
	@Test
	public void  testBagSimpleAdd() {
	// [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
	Money bag[] = { f12CHF, f7USD };
	Money bag1[] = { f12CHF,f12CHF, f7USD };
	MoneyBag expected = new MoneyBag(bag);
	assertEquals(bag1, f12CHF.add(expected));
	}
	
	@Test
	public void  testSimpleBagAdd() {
	// [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
	Money bag[] = { f12CHF, f7USD };
	Money bag1[] = { f12CHF,f7USD, f7USD };
	MoneyBag expected = new MoneyBag(bag);
	assertEquals(bag1, expected.add(f7USD));
	}
	
	@Test
	public void  testBagBagAdd() {
	// [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
	Money bag[] = { f12CHF, f7USD };
	Money bag2[] = {  f7USD,f12CHF };
	Money bag3[] = {  f12CHF, f7USD, f7USD,f12CHF };
	MoneyBag expected = new MoneyBag(bag);
	MoneyBag expected2 = new MoneyBag(bag2);
	assertEquals(bag3, expected.add(expected2));
	}
}
