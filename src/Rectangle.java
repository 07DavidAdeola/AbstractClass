public class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(){
        // this.color
        super();
        length = 0;
        width = 0;
    }

    Rectangle(String color, double length, double width) {
        // this.color = "";
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public void calculateArea() {
        double area = this.length * this.width;
        System.out.println("Rectangle area: " + area);
    }
}
