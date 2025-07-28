package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.Income;

import org.junit.jupiter.api.Test;

class IncomeTest {

	private Income income;
	@BeforeEach
	void setUp() {
		income = new Income();
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/data - Sheet1.csv", numLinesToSkip = 1)
	void testIncome(int impeller, int motor, int cover, Double expectedResult) {
		Double result = income.calculateIncome(impeller, motor, cover);
		assertEquals(expectedResult, result);
	}
}
