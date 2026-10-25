
abstract class Shape
{
    abstract void calArea();
}

class Circle extends Shape
{
    int r;

    Circle(int r)
    {
        this.r = r;
    }

    void calArea()
    {
        System.out.println("C: " + 3.14 * r * r);
    }
}

class Rect extends Shape
{
    int l, b;

    Rect(int l, int b)
    {
        this.l = l;
        this.b = b;
    }

    void calArea()
    {
        System.out.println("R: " + l * b);
    }
}

class Square extends Shape
{
    int s;

    Square(int s)
    {
        this.s = s;
    }

    void calArea()
    {
        System.out.println("S: " + s * s);
    }
}

public class Abstract
{
    public static void main(String[] args)
    {
        Shape s;

        s = new Circle(2);
        s.calArea();

        s = new Rect(4, 5);
        s.calArea();

        s = new Square(5);
        s.calArea();
    }
}
