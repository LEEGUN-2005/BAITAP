package BAITAP2;
public class Nhanvien extends Nguoi {
    private int luong;

    public Nhanvien(String ten, String diachi, int luong) {
        super(ten, diachi); 
        this.luong = luong;
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("luong: " + luong);
    }
}
