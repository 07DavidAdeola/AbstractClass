public abstract class Shape {
    String color;

    // abstract class can have constructors
    Shape() {
        this.color = "";
    }

    Shape(String color) {
        this.color = color;
    }

    // Abstract class can have concrete methods (defined methods)
    // You know what the method will do
    public void display(){
        System.out.println("color is: " + this.color);
    }

    // Circle is-a shape, rectangle is also a shape.
    // Circle and Rectangle have unique formula to calculate the area
    // Area of a rectangle = length x width
    // Area of a circle = PI x (radius)^2

    // calculateArea is an abstract method. put "abstract" between the access modifiers and return type
    // Abstract method do not have any definition/
    // Declaring a method - calculateArea()
    // Declaring means it does not provide any definition/ implementation
    public abstract void calculateArea();
    // Abstract class can have more than one
}
