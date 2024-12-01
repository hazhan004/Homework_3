/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_3;

public abstract class property {
   private double area;
   private int rooms;
   private String neighborhood;
   private double price;
   
   public property(double area,int rooms,String neighborhood,double price){
   this.area=area;
   this.rooms=rooms;
   this.neighborhood=neighborhood;
   this.price=price;
   }
   
   public double getarea(){
   return area;
   }
   
   public int getrooms(){
   return rooms;
   }
   
   public String getneighborhood(){
   return neighborhood;
   }
   
   public double getprice(){
   return price;
   }
   
   public abstract void display();
   
}
