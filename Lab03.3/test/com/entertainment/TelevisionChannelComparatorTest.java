package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionChannelComparatorTest {
    //need 3 things
    //2 Television objs
    private Television tv = new Television();
    private Television tv2 = new Television();
    //and independent agent --the comparator
    private TelevisionChannelComparator comparator;

    @Before
    public void setUp() {
        comparator = new TelevisionChannelComparator();
        tv = new Television();
        tv2= new Television();
    }

    @Test
    public void televisionChannelComparatorTest_ShouldReturnZero_WhenChannelsAreSame() {
        int result = comparator.compare(tv, tv2);
        assertEquals(0, result);
    }

    @Test
    public void televisionChannelComparatorTest_ShouldReturnPositive_WhenFirst_isGreaterThanSecond()
    throws Exception{
        tv.changeChannel(8);
        int result = comparator.compare(tv, tv2);
        assertEquals(1, result);
    }

    @Test
    public void televisionChannelComparatorTest_ShouldReturnNegative_WhenFirst_isLessThanSecond()
    throws Exception{
        tv2.changeChannel(6);
        int result = comparator.compare(tv, tv2);
        assertEquals(-1, result);
    }
}