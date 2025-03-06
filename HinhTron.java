public class HinhTron extends HinhHoc {
    public float banKinh;

    public HinhTron() {
        ten = "Hình tròn";
    }

    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        banKinh = sc.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
