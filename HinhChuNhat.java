
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat() {
        ten = "hinh chu nhat";
    }
    public void nhapdai() {
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        dai = kb.nextFloat();
    }
    public void nhaprong() {
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap chieu rong: ");
        rong = kb.nextFloat();
    }
    public void tinhchuvi() {
        chuvi = 2 * (dai + rong);
    }
    public void tinhdientich() {
        dientich = dai * rong;
    }
}
