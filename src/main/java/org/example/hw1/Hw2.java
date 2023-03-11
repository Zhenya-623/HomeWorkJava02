package org.example.hw1;

import org.example.hw1.model.Vector;

public class Hw2 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("длина вектора = " + vector1.lengthVector());
        System.out.println("длина вектора = " + vector2.lengthVector());
        System.out.println("скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("векторное произведение = " + vector1.vectorMulti(vector2));
        System.out.println("косинус угла = " + vector1.cosVector(vector2));
        System.out.println("сумма векторов = " + vector1.sumVector(vector2));
        System.out.println("разница векторов = " + vector1.difVector(vector2));
    }
}

