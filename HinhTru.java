
import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float chieucao;

    public HinhTru() {
        ten = "hinh tru";
    }
    public void nhapchieucao() {
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap chieu cao: ");
        chieucao = kb.nextFloat();
    }
    public void tinhthetich() {
        tinhdientich(); 
        thetich = dientich * chieucao;
    }
}
