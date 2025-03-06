
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        ten = "hinh vuong";
    }

    public void nhapcanh() {
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap canh: ");
        dai = rong = kb.nextFloat();
    }
}
