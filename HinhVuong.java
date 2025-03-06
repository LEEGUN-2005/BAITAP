public class HinhVuong extends HinhChuNhat {

    public HinhVuong() {
        ten = "Hình vuông";
    }

    public void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh: ");
        dai = rong = sc.nextFloat();
    }
}
