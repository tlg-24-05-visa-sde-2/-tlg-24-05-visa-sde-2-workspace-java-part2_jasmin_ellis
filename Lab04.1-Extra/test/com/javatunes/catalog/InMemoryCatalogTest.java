package com.javatunes.catalog;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setup() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void testHasRockGenre_atSpecifiedRate() {
        //must be rock, (musiccategory.rock)
    }
}