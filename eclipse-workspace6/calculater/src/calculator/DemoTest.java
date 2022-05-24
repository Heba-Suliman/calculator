package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoTest {
	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		this.calculator=new Calculator();
	}

	@Test
	void test1() {
		assertEquals(0, this.calculator.add(0, 0));
	}
	@Test
	void test2() {
		assertEquals(1, this.calculator.add(1, 0));
	}
	@Test
	void test3() {
		assertEquals(-1, this.calculator.add(0, -1));
	}
	@Test
	void test4() {
		assertEquals(2, this.calculator.add(1, 1));
	}
	@Test
	void test5() {
		assertEquals(0, this.calculator.add(-1, 1));
	}
	@Test
	void test6() {
		assertEquals(-3, this.calculator.add(-1, -2));
	}
	@Test
	void test7() {
		assertEquals(1, this.calculator.add(-1, 2));
	}
	@Test
	void test8() {
		assertEquals(-1, this.calculator.add(1, -2));
	}
	@Test
	void test9() {
		assertEquals(0, this.calculator.sub(0, 0));
	}
	@Test
	void test10() {
		assertEquals(1, this.calculator.sub(1, 0));
	}
	@Test
	void test11() {
		assertEquals(1, this.calculator.sub(0, -1));
	}
	@Test
	void test12() {
		assertEquals(0, this.calculator.sub(1, 1));
	}
	@Test
	void test13() {
		assertEquals(-2, this.calculator.sub(-1, 1));
	}
	@Test
	void test14() {
		assertEquals(1, this.calculator.sub(-1, -2));
	}
	@Test
	void test15() {
		assertEquals(-3, this.calculator.sub(-1, 2));
	}
	@Test
	void test16() {
		assertEquals(3, this.calculator.sub(1, -2));
	}
	@Test
	void test17() {
		assertEquals(0, this.calculator.mul(0, 0));
	}
	@Test
	void test18() {
		assertEquals(0, this.calculator.mul(1, 0));
	}
	@Test
	void test19() {
		assertEquals(0, this.calculator.mul(0, -1));
	}
	@Test
	void test20() {
		assertEquals(1, this.calculator.mul(1, 1));
	}
	@Test
	void test21() {
		assertEquals(-1, this.calculator.mul(-1, 1));
	}
	@Test
	void test22() {
		assertEquals(2, this.calculator.mul(-1, -2));
	}
	@Test
	void test23() {
		assertEquals(-2, this.calculator.mul(-1, 2));
	}
	@Test
	void test24() {
		assertEquals(-2, this.calculator.mul(1, -2));

}
	@Test
	void test25() {
		assertEquals(2, this.calculator.divInt(8,3));
}
	@Test
	void test26() {
		assertEquals(2.6666666666666665, this.calculator.divReal(8,3));
}
}