package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television tv;
    private Television tv2;

    @Before
    public void setUp() {
        tv = new Television("Sony", 50, DisplayType.PLASMA);
        tv2= new Television("Sony", 50, DisplayType.PLASMA);
    }

    @Test
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_lowerBound() {
        try{
            tv.changeChannel(0);    //should throw exception
            fail("Should have throwm invalid channel exception");
        }
        catch (InvalidChannelException e){
            String expected = "Invalid channel: 0. Allowed range: [1,999].";
            assertEquals(expected,e.getMessage());
        }
    }

    @Test
    public void  changeChannel_shouldThrowInvalidChannelException_whenInvalid_upperBound() throws Exception{
        try {
            tv.changeChannel(1000);
        } catch (InvalidChannelException e){
           String expected = "Invalid channel: 1000. Allowed range: [1,999].";
           assertEquals(expected, e.getMessage());
        }
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_upperBoumd() throws Exception {
        tv.changeChannel(999);
        assertEquals(999, tv.getCurrentChannel());
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_lowerBound() throws Exception {
        tv.changeChannel(1);
        assertEquals(1, tv.getCurrentChannel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_lowerBound() {
        tv.setVolume(-1); //should throw an exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_upperBound() {
        tv.setVolume(101);
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_upperBound() {
        tv.setVolume(100);
        assertEquals(100, tv.getVolume());
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_lowerBound() {
        tv.setVolume(0);
        assertEquals(0, tv.getVolume());
    }
}