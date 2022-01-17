package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;

public enum Season {

    LOW(new BigDecimal(250), new BigDecimal(350)),
    HIGH(new BigDecimal(320), new BigDecimal(420)),
    HOLIDAY(new BigDecimal(400), new BigDecimal(500));

    private BigDecimal singleBedPrices;
    private BigDecimal doubleBedPrices;

    Season(BigDecimal singleBedPrices, BigDecimal doubleBedPrices) {
        this.singleBedPrices = singleBedPrices;
        this.doubleBedPrices = doubleBedPrices;
    }

    public BigDecimal getSingleBedPrices() {
        return singleBedPrices;
    }

    public BigDecimal getDoubleBedPrices() {
        return doubleBedPrices;
    }
}

