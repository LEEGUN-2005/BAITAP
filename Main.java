public class Main {
    public static void main(String[] args) {
     
        HinhTron hinhTron = new HinhTron();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.xuatTen();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

    
        HinhTru hinhTru = new HinhTru();
        hinhTru.nhapBanKinh();
        hinhTru.nhapChieuCao();
        hinhTru.tinhDienTich();
        hinhTru.tinhTheTich();
        hinhTru.xuatTen();
        hinhTru.inDienTich();
        hinhTru.inTheTich();

      
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.xuatTen();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

     
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.xuatTen();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }
}
