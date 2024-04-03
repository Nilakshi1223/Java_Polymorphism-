public class Shapes {

    void draw(){}
}

class Rectangle extends Shapes{
    @Override
    void draw() {
        System.out.println("Draw rectangle!");
    }
}

class Circle extends Shapes{
    @Override
    void draw() {
        System.out.println("Draw circle!");
    }
}

class Triangle extends Shapes{
    @Override
    void draw() {
        System.out.println("Draw triangle!");
    }
}

class Test2 {
    public static void main(String[] args) {
        Shapes s;
        s = new Rectangle(); s.draw();
        s = new Circle();s.draw();
        s = new Triangle();s.draw();
    }
}
