/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.views;

import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;

/**
 *
 * @author Sistemas-12
 */
public class MapVehicle {
    public static void main(String[] args) {
        
        Mapvehicle<String, List<? extends Object>> objectsMap;
        objectsMap = new HashMap<>();
        objectsMap.put("String", Arrays.asList("Toyota","Hilux"));


    //Put Object List into Map
    objectsMap.put("Object", Arrays.asList(new Object(),new Object()));

    //Put Car List into Map
    objectsMap.put("Car", Arrays.asList(new Car("Band1"),new Car("Band2")));
    }
}
