package bai_6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point3D extends Point2D {
    public float z;

    Point3D(){
    }
    Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }

    public String toString(){
        return super.toString()+"\b ,"+getZ()+")";
    }

    public static void main(String[] args) {
        Point3D d = new Point3D(1,2,3);
        System.out.println(d.getXYZ()[0]);
    }

}
