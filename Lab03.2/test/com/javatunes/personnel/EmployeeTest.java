package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee emp1;
    private Employee emp2;


    @Before
    public void setUp() {
        emp1 = new SalariedEmployee("Jay", Date.valueOf("1990-08-25"));
        emp2 = new SalariedEmployee("Jay", Date.valueOf("1990-08-25"));
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate() {
        emp2.setName("Jasmin");
        assertNotEquals(emp1, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameNmae_differentHireDate() {
        emp2.setHireDate(Date.valueOf("1990-08-24"));
        assertNotEquals(emp1, emp2);
    }

    @Test
    public void equals_shouldReturnTrue_sameNmae_sameHireDate() {
        assertEquals(emp1, emp2);
    }
}