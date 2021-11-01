package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class CustomListTest {

        private CustomList list;

        @BeforeEach
        public void createList() {
            list = new CustomList(null, new ArrayList<City>());
        }

        @Test
        public void addCityTest() {
            int listSize = list.getCount();
            list.addCity(new City("Edmonton", "Alberta"));
            assertEquals(listSize + 1, list.getCount());

        }

        @Test
        public void hasCityTest() {
            City newCity = new City("Edmonton", "Alberta");
            list.addCity(newCity);
            assertEquals(true, list.hasCity(newCity));
        }

        @Test
        public void deleteCityTest() {
            City newCity = new City("Edmonton", "Alberta");
            list.addCity(newCity);
            list.deleteCity(newCity);
            assertEquals(0, list.getCount());
        }

}

