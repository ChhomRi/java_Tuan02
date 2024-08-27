/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt05;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("=============MENU DO CHON DI================");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    themThiSinh(ts, sc);
                    break;
                case 2:
                    hienThiThongTin(ts);
                    break;
                case 3:
                    timKiemTheSoBaoDanh(ts, sc);
                    break;
                case 0:
                    System.out.println("GoodBye hen gap lai:");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                
            }
        } while (chon!=0);
    }
    public static void themThiSinh(TuyenSinh ts,Scanner sc){
        String chonkhoi="a";
        String tieptuc = " ";
        double toan,hoa,sinh,van,su,dia,ly;
        do{
            System.out.println("Chon khoi thi:(A,B,C):");
            chonkhoi = sc.nextLine();
            
            System.out.print("Nhap so bao danh:");
            String soBaoDanh = sc.nextLine();
            System.out.print("Nhap ho ten:");
            String hoTen = sc.nextLine();
            System.out.print("Nhap dia chi:");
            String diaChi = sc.nextLine();
            System.out.print("Nhap muc uu tien:");
            String mucUuTien = sc.nextLine(); 
            if(chonkhoi.equalsIgnoreCase("a")){
                System.out.print("Diem toan:");
                toan = sc.nextDouble();
                System.out.print("Diem ly:");
                ly =sc.nextDouble();
                System.out.print("Diem hoa:");
                hoa = sc.nextDouble();
                ts.themThiSinh(new ThiSinhKhoiA(soBaoDanh,hoTen,diaChi,mucUuTien,toan,ly,hoa));
            } else if (chonkhoi.equalsIgnoreCase("b")){
                System.out.print("Diem toan:");
                toan = sc.nextDouble();
                System.out.print("Diem hoa:");
                hoa = sc.nextDouble();
                System.out.print("Diem sinh:");
                sinh = sc.nextDouble();
                ts.themThiSinh(new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien, toan, hoa , sinh));
            }  else if (chonkhoi.equalsIgnoreCase("c")){
                System.out.print("Diem van:");
                van = sc.nextDouble();
                System.out.print("Diem su:");
                su = sc.nextDouble();
                System.out.print("Diem dia:");
                dia = sc.nextDouble();
                ts.themThiSinh(new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien, van, su , dia));
            }
            System.out.print("Tiep tuc(Y/N:");
            tieptuc = sc.nextLine();    
            
            
        } while (tieptuc.equalsIgnoreCase("y"));
        
}
