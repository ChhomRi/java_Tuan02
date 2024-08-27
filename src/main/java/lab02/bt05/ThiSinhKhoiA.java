/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt05;

/**
 *
 * @author ADMIN
 */
public class ThiSinhKhoiA extends ThiSinh{
    private double Toan;
    private double Ly;
    private double Hoa;

    public ThiSinhKhoiA(String SoBaoDanh, String hoTen, String diaChi, String mucUuTien, double Toan, double Ly, double Hoa) {
        super(SoBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double Toan) {
        this.Toan = Toan;
    }

    public double getLy() {
        return Ly;
    }

    public void setLy(double Ly) {
        this.Ly = Ly;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double Hoa) {
        this.Hoa = Hoa;
    }
    

    @Override
    public String toString() {
        return "ThiSinhKhoiA{"  + super.toString() + "Toan=" + Toan + ", Ly=" + Ly + ", Hoa=" + Hoa + '}';
    }
    
    
}
