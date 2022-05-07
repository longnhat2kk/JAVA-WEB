package bai_12_java_collection_framework.bai_tap.arraylist_linkedlist_trong_java_collection_framework;

public class Product {
    private String tenSP;
    private  double gia;

    public Product(){
        this.tenSP=null;
        this.gia=0;
    }
    public Product(String tenSP, double gia) {
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }




}
