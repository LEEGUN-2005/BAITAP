package BAITAP2;


public class Main {
    public static void main(String[] args) {
        Nhanvien nv = new Nhanvien("pham thi bich", "Ha noi", 15000000);
        System.out.println("thong tin nhan vien:");
        nv.hienthi();
        System.out.println();
        Khachhang kh = new Khachhang("nguyen van an", "tphcm", 5000000);
        System.out.println("thong tin khach hang:");
        kh.hienthi();
    }
}
