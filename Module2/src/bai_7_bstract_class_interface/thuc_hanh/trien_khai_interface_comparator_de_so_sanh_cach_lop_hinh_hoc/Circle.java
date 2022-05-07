package bai_7_bstract_class_interface.thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cach_lop_hinh_hoc;

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
}
