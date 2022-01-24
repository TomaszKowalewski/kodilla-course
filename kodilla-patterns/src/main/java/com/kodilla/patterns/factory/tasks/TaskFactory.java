package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Drive to pub", "Manchester", "car");
            case PAINTING:
                return new PaintingTask("Paint the art", "black & white", "act");
            case SHOPPING:
                return new ShoppingTask("Bay an equipment", "camera", 1 );
            default:
                return null;
        }
    }
}
