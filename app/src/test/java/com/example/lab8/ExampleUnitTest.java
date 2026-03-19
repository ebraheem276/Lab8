package com.example.lab8;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void testHasCity() {
        CityManager manager = new CityManager();
        manager.addCity("Edmonton");

        assertTrue(manager.hasCity("Edmonton"));
        assertFalse(manager.hasCity("Calgary"));
    }

    @Test
    public void testDeleteCity() {
        CityManager manager = new CityManager();
        manager.addCity("Edmonton");
        manager.addCity("Calgary");

        manager.deleteCity("Edmonton");

        assertFalse(manager.hasCity("Edmonton"));
        assertTrue(manager.hasCity("Calgary"));
    }
}