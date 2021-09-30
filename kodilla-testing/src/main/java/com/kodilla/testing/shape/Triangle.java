package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private final static String name = "Triangle";

    private double edgeLenghtA;
    private double lenghtH;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.edgeLenghtA, edgeLenghtA) == 0 && Double.compare(triangle.lenghtH, lenghtH) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeLenghtA, lenghtH);
    }

    public Triangle(double edgeLenghtA, double lenghtH) {
        this.edgeLenghtA = edgeLenghtA;
        this.lenghtH = lenghtH;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return edgeLenghtA * lenghtH * 0.5 ;
    }
}
