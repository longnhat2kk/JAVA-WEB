package bai_6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    public double radius = 1.0;

    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*3.14;
    }

    public double getPerimeter(){
        return 2*radius*3.14;
    }

    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString());
    }
}
