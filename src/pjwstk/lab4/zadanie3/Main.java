/*
    Zadanie 3:
    Autor: Rafał Tęcza & Damian Brzoskowski
    Index: s19468 & s18499
*/

package pjwstk.lab4.zadanie3;

import pjwstk.lab4.zadanie3.MovablePoint;
import pjwstk.lab4.zadanie3.Point;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(2.0f, 5.3f);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(point.getX(), point.getY(), 300f, 200f);
        System.out.println(movablePoint);
    }
}
