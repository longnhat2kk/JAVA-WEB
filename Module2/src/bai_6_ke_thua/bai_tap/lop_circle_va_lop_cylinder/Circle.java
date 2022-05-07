package bai_6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    public double radius;
    public String color;

    Circle(){
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "radius "+getRadius()+" color: "+getColor();
    }
}
