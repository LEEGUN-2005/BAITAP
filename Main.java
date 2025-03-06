public class Main {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.nhapbankinh();
        hinhTron.tinhchuvi();
        hinhTron.tinhdientich();
        hinhTron.xuatten();
        hinhTron.inchuvi();
        hinhTron.indientich();

        HinhTru hinhTru = new HinhTru();
        hinhTru.nhapbankinh();
        hinhTru.nhapchieucao();
        hinhTru.tinhthetich();
        hinhTru.xuatten();
        hinhTru.indientich();
        hinhTru.inthetich();

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.nhapdai();
        hinhChuNhat.nhaprong();
        hinhChuNhat.tinhchuvi();
        hinhChuNhat.tinhdientich();
        hinhChuNhat.xuatten();
        hinhChuNhat.inchuvi();
        hinhChuNhat.indientich();

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.nhapcanh();
        hinhVuong.tinhchuvi();
        hinhVuong.tinhdientich();
        hinhVuong.xuatten();
        hinhVuong.inchuvi();
        hinhVuong.indientich();
    }
}
