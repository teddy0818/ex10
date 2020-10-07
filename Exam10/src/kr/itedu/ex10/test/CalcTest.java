package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		int n1 = 1;
		int n2 = 3;
		Assert.assertEquals(n1+n2, Calc.sum(n1, n2));
		
		n1 = 11;
		n2 = 6;
		Assert.assertEquals(n1+n2, Calc.sum(n1, n2));
		
		n1 = 10;
		n2 = 20;
		Assert.assertEquals(n1+n2, Calc.sum(n1, n2));
	}

}
