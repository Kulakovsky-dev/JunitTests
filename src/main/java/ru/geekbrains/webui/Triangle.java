package ru.geekbrains.webui;

public class Triangle {
    public double triangleSquare(double a, double b, double c) {
        double pp = (a + b + c) /2;
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }

}
