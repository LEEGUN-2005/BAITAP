public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru() {
        ten = "Hình trụ";
    }

    public void nhapChieuCao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich() {
        theTich = dienTich * chieuCao;
    }
}
