/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.BT02;

import java.text.DecimalFormat;



/**
 *
 * @author ADMIN
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        DecimalFormat fmt = new DecimalFormat("#,##0.00");
        Account my =  new Account("CR70","CHHOM RI",6000000);
        Account friend = new Account("CR7","YOU",500000);
        System.out.println("==== Thong tin tai khoan ban dau");
        System.out.println("My Account: [id: "+  my.getId() + ", name:"+ my.getName() + ", Balance:" + fmt.format(my.getBalance())+ "]");
        System.out.println("Friend Account: [id: "+  friend.getId() + ", name:"+ friend.getName()+ ", Balance:" +fmt.format(friend.getBalance()) + "]");
        
        System.out.println("Nap tien vao My Account");
        my.credit(2000000);
        System.out.println("Rut tien tu friend account");
        friend.equals(3000000);
        System.out.println("Chuyen tien tu my account den friend account");
        my.tranferTo(friend,2000000);
        System.out.println("Sau khi thuc hien giao dich:");
        
        System.out.println("My Account: [id: "+  my.getId() + ", name:"+ my.getName() + ", Balance:" + fmt.format(my.getBalance())+ "]");
        System.out.println("Friend Account: [id: "+  friend.getId() + ", name:"+ friend.getName()+ ", Balance:" +fmt.format(friend.getBalance()) + "]");
    }
    
    
}
