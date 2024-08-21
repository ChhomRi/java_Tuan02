/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt02;

/**
 *
 * @author DELL
 */
public class HinhTru  extends Hinhtron{
      private double chieuCao;

    public HinhTru(double chieuCao, double banKinh) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }
    public HinhTru(){
        super(1.0);
        chieuCao = 1.0;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
      
      
    public double tinhTheTich(){
        return super.TinhDienTich()*chieuCao;
    }  
    @Override
    public double TinhDienTich(){
        double s_day = super.TinhDienTich();
        double s_xq = super.TinhChuVi()*chieuCao;
        return 2*s_day + s_xq;
    }
}
