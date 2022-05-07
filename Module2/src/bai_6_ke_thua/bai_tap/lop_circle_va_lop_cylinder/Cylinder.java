package bai_6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    public double width;

    Cylinder(){
    }

    Cylinder(double radius, String color, double width){
        super(radius, color);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString(){
        return super.toString()+" width: "+getWidth();
    }

    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setWidth(6);
        cy.setColor("red");
        cy.setRadius(4.5);
        System.out.println(cy.toString());
    }
}
