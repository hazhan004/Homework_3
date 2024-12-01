/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_3;


public class main_test {
    public static void main(String[] args) {
       
        real_Estate_Agency agency = new real_Estate_Agency(5);

        
        property villa = new villa(250.0, 5, "Luxury Area", 750000.0, true, 3);
        property apartment = new apartment(120.0, 3, "Downtown", 200000.0, 10, true);
        property furnishedApartment = new furnishedApartment(100.0, 2, "City Center", 150000.0, 5, false, 2);

        
        agency.addProperty(villa);
        agency.addProperty(apartment);
        agency.addProperty(furnishedApartment);

       System.out.println("Property added successfully.");
        System.out.println("List of Properties:");
        agency.displayAllProperties();

        
        agency.removeProperty(apartment);

        
        System.out.println("\nUpdated List of Properties:");
        agency.displayAllProperties();
    } 
}
