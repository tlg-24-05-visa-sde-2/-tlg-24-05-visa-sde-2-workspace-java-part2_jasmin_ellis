package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {
    private SalariedEmployee semp;

    @Before
    public void setUp()  {
        semp = new SalariedEmployee("Jasmin",
                Date.valueOf("2020-10-01"),
                1500.0);
    }

    @Test
    public void testPayTaxes() {
        assertEquals(450.0, semp.payTaxes(), 0.01); //30% of salary

    }

    @Test
    public void testPay() {
        assertEquals(1500., semp.pay(), 0.01);  //just their fixed salary

    }
}