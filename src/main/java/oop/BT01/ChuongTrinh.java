/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.BT01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Khai bao 2 doi tuong r1,2 kiểu lớp Rectangle
        Rectangle r1,r2;
        //Tạo đối tượng r1
        System.out.println("Tao doi tuong r1...");
        r1 = new Rectangle();
         //Tạo đối tượng r1
        System.out.println("Tao doi tuong r2...");
        System.out.print("cho biet dai:");
        double dai = sc.nextDouble();
        System.out.println("Cho biet rong:");
        double rong = sc.nextDouble();
        
        r2 = new Rectangle(dai, rong);
        System.out.println("Thong tin ket qua");
        System.out.println("HCN thu 1: dai:"+ r1.getLength()+"-rong:"+ r1.getWidth() + "- dien tich:" + r1.finArea()+ "-chu vi" + r1.findPerimeter());
        System.out.println("HCN thu 2: rong:"+ r2.getLength()+"-rong:"+ r2.getWidth() + "- dien tich:" + r2.finArea()+ "-chu vi" + r2.findPerimeter());
    }
    
}
