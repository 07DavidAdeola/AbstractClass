public class Circle extends Shape {

        double radius;

        Circle(){
            this.color = "";
            this.radius = 0;
        }

        Circle(String color, double radius){
            //this.color= "";
            super(color);
            this.radius = radius;
        }

    @Override
    public void calculateArea() {
        double area = 3.1415 * this.radius * this.radius;
        System.out.println("Circle area: " + area);
    }
}




