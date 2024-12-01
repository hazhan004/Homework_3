/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_3;

/**
 *
 * @author Sherdll Store
 */
public  class apartment extends property{

    
    
    private int floorNumber;
    private boolean hasParkingLot;

    public apartment(double area, int rooms, String neighborhood, double price,int floorNumber, boolean hasParkingLot) 
    {
        super(area, rooms, neighborhood, price);
        this.floorNumber=floorNumber;
        this.hasParkingLot=hasParkingLot;
    }
     @Override
    public void display(){
        System.out.println("Type: villa");
        System.out.println("Area: "+ getarea() +"m2, Rooms: " + getrooms() + ",neighborhood: "+getneighborhood()+",price: $"+ getprice());
        System.out.println("Floor Number:" + floorNumber +"Parking Lot :"+(hasParkingLot ? "yes" : "No"));
    
    }
    
    
}
