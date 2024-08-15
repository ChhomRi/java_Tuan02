/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.BT01;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
    //Khai bao du lieu
    private double length;
    private double width;
    
    //Định nghĩa các phương thức
    public Rectangle(){
        length = 1.0;
        width = 1.0;
    }
     public Rectangle(double length, double width){
         this.length = length;
         this.width = width;
         
     }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
     public double finArea(){
         return length*width;
     }
     public double findPerimeter(){
         return (length+width)*2;
     }
     
     

    /**
     * @param args the command line arguments
     */
   
}
