package bai_4_lop_va_doi_tuong_trong_java.bai_tap.Xay_dung_lop_Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan(){
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
        if (isOn()){
            return "IF: Speed: "+getSpeed()+", Color: "+getColor()+", Radius: "+getRadius()+", FAN IS ON";
        }
        return "IF: Color: "+getColor()+", Radius: "+getRadius()+", FAN IS OFF";
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setColor("Yello");
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
