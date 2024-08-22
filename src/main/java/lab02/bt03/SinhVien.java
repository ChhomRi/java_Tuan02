/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt03;

/**
 *
 * @author DELL
 */
public abstract class SinhVien {
    public  String hoTen;
    public  String Nganh;

    public SinhVien(String hoTen, String Nganh) {
        this.hoTen = hoTen;
        this.Nganh = Nganh;
    }
    public abstract double getDiem();
    
    public  String XepHocLuc(){
         String kq = "";
        double dtb = getDiem();
        if (dtb < 5) {
            kq = "Yeu";
        } else if (dtb < 6.5) {
            kq = "Trung binh";
        } else if (dtb < 7.5) {
            kq = "Kha";
        } else if (dtb < 9) {
            kq = "Gioi";
        } else {
            kq = "Xuat sac";
        }
        return kq;
    }
    public void Xuat() {
        System.out.println("Ho ten: " + hoTen + " " + " Nganh: " + Nganh + " " + "Diem: " + getDiem() + " " + "Hoc luc: " + XepHocLuc());

    }
    
    
}
