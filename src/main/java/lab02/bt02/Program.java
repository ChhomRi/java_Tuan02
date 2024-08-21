/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt02;

/**
 *
 * @author DELL
 */
public class Program {
    public static void main(String[] args) {
        Hinhtron r1 = new Hinhtron(5.0);
        System.out.println("Hinh Tron[ban kinh:" + r1.getBanKinh() + ", dien tich:" + r1.TinhDienTich() + ", chu vi" + r1.TinhChuVi());
        
        HinhTru r2  = new HinhTru(5.0, 4.0);
        System.out.println("Hinh tru[ban kinh" + r2.getBanKinh() + ", chieu cao" + r2.getChieuCao() + ", dien tich:" + r2.TinhDienTich() + ", dien tich" + r2.TinhDienTich() + ", the tich: " + r2.tinhTheTich());
    }
}
