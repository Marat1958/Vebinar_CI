package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeServiceTest {

    @Test
    public void shouldNoIncome() {
        IncomeService service = new IncomeService();

        int age = 2;

        int actual = service.calcIncome(age);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSalary() {
        IncomeService service = new IncomeService();

        int age = 50;

        int actual = service.calcIncome(age);
        int expected = 50_000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPocketMoney() {
        IncomeService service = new IncomeService();

        int age = 15;

        int actual = service.calcIncome(age);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPension() {
        IncomeService service = new IncomeService();

        int age = 85;

        int actual = service.calcIncome(age);
        int expected = 20_000;

        Assertions.assertEquals(expected, actual);
    }
}
