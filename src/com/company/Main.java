package com.company;

import Classes.*;

public class Main {

    /**
     * 3. Создать класс окружность, член класса – R. Предусмотреть в классе методы вычисления и
     * вывода сведений о фигуре – площади, длины окружности. Создать производный класс – круглый
     * прямой цилиндр с высотой h, добавить в класс метод определения объема фигуры, перегрузить методы
     * расчета площади и вывода сведений о фигуре. Написать программу, демонстрирующую работу с
     * классом: дано N окружностей и M цилиндров, найти окружность максимальной площади и средний объем
     * цилиндров.
     * @param args
     */
    public static void main(String[] args) {
        final int N = 5;
        final int M = 5;
        Circles circles = new Circles(N);
        Cilinders cilinders = new Cilinders(M);
        for (int i = 0; i < N; i++) {
            circles.add(new Circle((int) (Math.random() * 49 + 1)));
        }
        for (int i = 0; i < M; i++) {
            cilinders.add(new Cilinder((int) (Math.random() * 49 + 1), (int) (Math.random() * 49 + 1)));
        }
        System.out.println(circles);
        System.out.println("Max Circle S: " + circles.getLargestS());
        System.out.println("-----------------------");
        System.out.println(cilinders);
        System.out.println("AvgV = " + cilinders.getAvgV());

        System.out.println("\n-------------------\n");

        List_of_Circles listOfCircles = new List_of_Circles();
        List_of_Cilinders listOfCylinders  = new List_of_Cilinders();
        for (int i = 0; i < N; i++) {
            listOfCircles.add(new Circle((int) (Math.random() * 49 + 1)));
        }
        for (int i = 0; i < M; i++) {
            listOfCylinders.add(new Cilinder((int) (Math.random() * 49 + 1), (int) (Math.random() * 49 + 1)));
        }
        System.out.println(listOfCircles);
        System.out.println("Max Circle S: " + listOfCircles.getLargestS_Of_CirclesList());
        System.out.println("-----------------------");
        System.out.println(listOfCylinders);
        System.out.println("AvgV = " +listOfCylinders.getAvgV_of_CylindersList());

    }
}
