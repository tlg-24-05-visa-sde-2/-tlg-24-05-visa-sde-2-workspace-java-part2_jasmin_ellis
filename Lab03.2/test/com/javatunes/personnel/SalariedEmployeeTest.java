package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {
    private SalariedEmployee semp;
    private SalariedEmployee semp2;

    @Before
    public void setUp()  {
        semp = new SalariedEmployee("Jasmin",
                Date.valueOf("2020-10-01"),
                1500.0);
        semp2 = new SalariedEmployee("Jasmin",
                Date.valueOf("2020-10-01"),
                1500.0);
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate_sameSalary() {
        semp2.setName("Uriyah");
        assertNotEquals(semp, semp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate_sameSalary() {
        semp2.setHireDate(Date.valueOf("2020-12-01"));
        assertFalse(semp.equals(semp2));
    }

    @Test
    public void equals_shouldReturnFalse_sameName_sameHireDate_differentSalary() {
        semp2.setSalary(2300.0);

        assertNotEquals(semp, semp2);
        assertFalse(semp.equals(semp2));
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(semp, semp2);
        assertTrue(semp.equals(semp2));
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