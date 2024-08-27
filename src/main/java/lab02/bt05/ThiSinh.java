/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt05;

/**
 *
 * @author ADMIN
 */
public class ThiSinh {
    private String SoBaoDanh;
    private String hoTen;
    private String diaChi;
    private String mucUuTien;

    public ThiSinh(String SoBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        this.SoBaoDanh = SoBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return SoBaoDanh;
    }

    public void setSoBaoDanh(String SoBaoDanh) {
        this.SoBaoDanh = SoBaoDanh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "SoBaoDanh=" + SoBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien=" + mucUuTien + '}';
    }
    
    
    
}
