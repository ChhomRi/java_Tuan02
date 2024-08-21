/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt02;

/**
 *
 * @author DELL
 */
public class Hinhtron {
     private double banKinh;

    public Hinhtron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    public double TinhDienTich(){
        return  Math.PI*banKinh*banKinh;
        
    }
    public double TinhChuVi(){
        return 2 * Math.PI* banKinh;
    }
}
