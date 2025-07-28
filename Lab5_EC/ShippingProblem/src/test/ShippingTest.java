package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.ShippingVehicle;

class ShippingTest {

	private ShippingVehicle shippingVehicle;	
	
	@BeforeEach
	void setUp() {
		shippingVehicle = new ShippingVehicle();
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/shipping-data.csv", numLinesToSkip = 1)
	void testShipping(int S, int M, int L, int e1, int e2, int e3) {
		List<Integer> expected = (e1 == -1) ? List.of(-1) : List.of(e1,e2,e3);
		List<Integer> result = shippingVehicle.calculate(S, M, L);
		assertEquals(expected, result);
	}
	

}
