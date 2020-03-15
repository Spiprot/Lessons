package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.a + " = " + s.area());
        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
        Point p1 = new Point(3, 0);
        Point p2 = new Point(2, 0);
        System.out.println(String.format("Рассоятоние между точками p1(%s,%s) и p2(%s,%s) = %s", p1.x, p1.y, p2.x,
                p2.y, p1.distance(p2)));
    }

    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
}