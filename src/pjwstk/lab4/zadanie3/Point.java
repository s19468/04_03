/*
    Zadanie 3:
    Autor: Rafał Tęcza & Damian Brzoskowski
    Index: s19468 & s18499
*/

package pjwstk.lab4.zadanie3;

public class Point {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] values = {this.x, this.y};
        return values;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
