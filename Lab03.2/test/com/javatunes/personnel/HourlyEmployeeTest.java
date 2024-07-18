package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {
    private HourlyEmployee emp;

    @Before
    public void setUp() {
        emp = new HourlyEmployee("Chris", Date.valueOf("2010-09-27"),
                37.50,
                25.0);
    }

    @Test
    public void testPayTaxes() {
        assertEquals(234.375, emp.payTaxes(), 0.001);


    }

    @Test
    public void testPay() {
        assertEquals(937.50, emp.pay(), 0.001); //rate * hours
    }
}