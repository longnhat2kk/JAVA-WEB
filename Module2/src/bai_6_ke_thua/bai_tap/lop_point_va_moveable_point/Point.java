package bai_6_ke_thua.bai_tap.lop_point_va_moveable_point;

public class Point {
    public float x;
    public float y;

    Point(){
    }
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    public String toString(){
        return "("+getX()+", "+getY()+")";
    }

}
