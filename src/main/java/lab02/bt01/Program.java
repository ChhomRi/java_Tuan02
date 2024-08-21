/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt01;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("======NHAP THONG TIN HINH CHU NHAT");
        System.out.print("Cho biet chieu dai:");
        double dai = sc.nextDouble();
        System.out.print("Cho biet chieu rong:");
        double rong = sc.nextDouble();
        
        ChuNhat cn = new ChuNhat(dai,rong);
        System.out.println("KET QUA:");
        cn.xuat();
        
         System.out.println("======NHAP THONG TIN HINH VUONG");
        System.out.print("Cho biet canh:");
        double canh = sc.nextDouble();
        
        ChuNhat hv = new Vuong (canh);
        System.out.println("KET QUA");
        hv.xuat();

    }
}
