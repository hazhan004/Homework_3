/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_3;

import java.util.ArrayList;

public class real_Estate_Agency {
     private ArrayList<property> properties;
    private int maxProperties;

   
    public real_Estate_Agency(int maxProperties) {
        this.maxProperties = maxProperties;
        this.properties = new ArrayList<>();
    }

   
    public void addProperty(property property) {
        if (properties.size() < maxProperties) {
            properties.add(property);
            
        } else {
            System.out.println("Cannot add more properties. Maximum capacity reached!");
        }
    }

   
    public void removeProperty(property property) {
        if (properties.remove(property)) {
            System.out.println("Property removed successfully.");
        } else {
            System.out.println("Property not found!");
        }
    }

    
    public void displayAllProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties available.");
            return;
        }

        for (property property : properties) {
            property.display();
            System.out.println("------------------");
        }
    }
}

