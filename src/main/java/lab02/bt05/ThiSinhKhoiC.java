/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt05;

/**
 *
 * @author ADMIN
 */
public class ThiSinhKhoiC  extends ThiSinh{
    private double Van;
    private double Su;
    private double Dia;

    public ThiSinhKhoiC(String SoBaoDanh, String hoTen, String diaChi, String mucUuTien , double Van,double Su,double Dia) {
        super(SoBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public double getVan() {
        return Van;
    }

    public void setVan(double Van) {
        this.Van = Van;
    }

    public double getSu() {
        return Su;
    }

    public void setSu(double Su) {
        this.Su = Su;
    }

    public double getDia() {
        return Dia;
    }

    public void setDia(double Dia) {
        this.Dia = Dia;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" +super.toString() + "Van=" + Van + ", Su=" + Su + ", Dia=" + Dia + '}';
    }
    
    
    
}
