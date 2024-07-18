/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicItem;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        // testFindById();
        // testFindByKeyword();
        // testFindByCategory();
        // testSize();
        // testGetAll();
    }

    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        MusicItem item = catalog.findById(6L);
        System.out.println(item);

        MusicItem notFound = catalog.findById(66L);
        System.out.println(notFound);

    }

    private static void testFindByKeyword() {
    }

    private static void testFindByCategory() {
    }

    private static void testSize() {
    }

    private static void testGetAll() {
    }
}