package BAITAP2;
public class Khachhang extends Nguoi {
    private int sodu;

    public Khachhang(String ten, String diachi, int sodu) {
        super(ten, diachi);
        this.sodu = sodu;
    }

    @Override
    public void hienthi() {
        super.hienthi(); 
        System.out.println("so du tai khoan: " + sodu);
    }
}
