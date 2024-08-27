/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt05;

/**
 *
 * @author ADMIN
 */
public class ThiSinhKhoiB  extends  ThiSinh{
    private double Toan;
    private double Hoa;
    private double Sinh;

    public ThiSinhKhoiB(String SoBaoDanh, String hoTen, String diaChi, String mucUuTien, double Toan,double Hoa ,double Sinh) {
        super(SoBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double Toan) {
        this.Toan = Toan;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double Hoa) {
        this.Hoa = Hoa;
    }

    public double getSinh() {
        return Sinh;
    }

    public void setSinh(double Sinh) {
        this.Sinh = Sinh;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +  super.toString() + "Toan=" + Toan + ", Hoa=" + Hoa + ", Sinh=" + Sinh + '}';
    }
    
    
}
