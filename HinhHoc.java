import java.util.Scanner;

public class HinhHoc {
    public static final float PI = 3.14f;
    public String ten;
    public float chuvi;
    public float dientich;
    public float thetich;

    public HinhHoc() {
        ten = "Hinh hoc";
    }

    public void xuatten() {
        System.out.println("ten hinh: " + ten);
    }

    public void inchuvi() {
        System.out.println("chu vi: " + chuvi);
    }

    public void indientich() {
        System.out.println("dien tich: " + dientich);
    }

    public void inthetich() {
        System.out.println("the tich: " + thetich);
    }
}
