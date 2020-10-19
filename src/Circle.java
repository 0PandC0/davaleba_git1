public class Circle {

    double radius;

    double area(){
        return radius*radius*Math.PI;

    }

    double length(){

        return 2*radius*Math.PI;
    }

    Circle(double radius){
        this.radius=radius;

    }
}
