
import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float bankinh;

    public HinhTron() {
        ten = "hinh tron";
    }

    public void nhapbankinh() {
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap ban kinh: ");
        bankinh = kb.nextFloat();
    }

    public void tinhchuvi() {
        chuvi = 2 * PI * bankinh;
    }

    public void tinhdientich() {
        dientich = PI * bankinh * bankinh;
    }
}
