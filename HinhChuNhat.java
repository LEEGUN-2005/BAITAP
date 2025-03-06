public class HinhChuNhat extends HinhHoc {
    public float dai, rong;

    public HinhChuNhat() {
        ten = "Hình chữ nhật";
    }

    public void nhapChieuDai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        dai = sc.nextFloat();
    }

    public void nhapChieuRong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        rong = sc.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        dienTich = dai * rong;
    }
}
