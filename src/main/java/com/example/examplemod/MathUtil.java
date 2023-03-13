package com.example.examplemod;

public class MathUtil {
    public static double dot(double x1, double y1, double x2, double y2) {
        return x1 * x2 + y1 * y2;
    }

    public static double convertMinecraftDegreesToRadians(double x) {
        return java.lang.Math.toRadians(x + 90);
    }

    public static float convertRadiansToMinecraftDegrees(double x) {
        return (float)  java.lang.Math.toDegrees(x) - 90;
    }
}
