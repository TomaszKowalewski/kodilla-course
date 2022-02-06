package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private List<Country> theListOfCountries = new ArrayList<>();

    public void addCountry(Country country) {
        theListOfCountries.add(country);
    }

    public List<Country> getTheListOfCountries() {
        return theListOfCountries;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
