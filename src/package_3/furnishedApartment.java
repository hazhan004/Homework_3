/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_3;

/**
 *
 * @author Sherdll Store
 */
public class furnishedApartment extends apartment{
    
    private int furnitureQuality;
    
    public furnishedApartment(double area, int rooms, String neighborhood, double price, int floorNumber, boolean hasParkingLot,int furnitureQuality) {
        super(area, rooms, neighborhood, price, floorNumber, hasParkingLot);
        this.furnitureQuality=furnitureQuality;
    }
      @Override
    public void display(){
        super.display();
        System.out.println("Furniture Quality:" + furnitureQuality +"(1=Best, 5=worst)");
    
    }
    
}
