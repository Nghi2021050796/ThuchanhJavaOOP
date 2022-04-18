package main;

import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class App54 {
    public static void main(String[] args) {
        // Thử nghiệm với lớp Hình tròn
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatten();
        hinhTron.nhapbanKinh();
        hinhTron.tinhchuVi();
        hinhTron.tinhdienTich();
        hinhTron.inchuVi();
        hinhTron.indienTich();

        // Thử nghiệm với lớp Hình Trụ
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatten();
        hinhTru.nhapchieuCao();
        hinhTru.tinhtheTich();
        hinhTru.intheTich();

       // Thử nghiệm với lớp HÌnh chữ nhật
       HinhChuNhat hinhChuNhat = new HinhChuNhat();
       hinhChuNhat.xuatten();
       hinhChuNhat.nhapChieuDai();
       hinhChuNhat.nhapChieuRong();
       hinhChuNhat.tinhchuVi();
       hinhChuNhat.tinhdienTich();
       hinhChuNhat.inchuVi();
       hinhChuNhat.indienTich();
       
       //Thử nghiệm với lớp Hình Vuông
       HinhVuong hinhVuong = new HinhVuong() ;
       hinhVuong.xuatten();
       hinhVuong.nhapCanh();
       hinhVuong.tinhchuVi();
       hinhVuong.tinhdienTich();
       hinhVuong.inchuVi();
       hinhVuong.indienTich();
    }
}    