/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_3;

/**
 *
 * @author Sherdll Store
 */
public class villa extends property{
    private boolean hasSwimmingPool;
   private int adjacentStreets; 

    public villa(double area, int rooms, String neighborhood, double price,boolean hasSwimmingPool,int adjacentStreets) {
        super(area, rooms, neighborhood, price);
        this.hasSwimmingPool=hasSwimmingPool;
        this.adjacentStreets=adjacentStreets;
    }
    
    @Override
    public void display(){
        System.out.println("Type: villa");
        System.out.println("Area: "+ getarea() +"m2, Rooms: " + getrooms() + ",neighborhood: "+getneighborhood()+",price: $"+ getprice());
        System.out.println("Swimming pool:" + (hasSwimmingPool ? "yes": "no")+",Adjacent Streets:"+adjacentStreets);
    
    }
}
