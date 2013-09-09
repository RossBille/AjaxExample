/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.newcastle.seng2050.ajax;

import au.edu.newcastle.seng2050.ajax.example.objects.Animal;
import au.edu.newcastle.seng2050.ajax.example.objects.House;
import au.edu.newcastle.seng2050.ajax.example.objects.Person;

/**
 *
 * @author Ross
 */
public class Repo {
    public static Person p1;
    public static Person p2;;   
    public static Animal a1;
    public static Animal a2;
    public static House h;
    static{
        p1 = new Person();
        p1.setFirstName("Ross");
        p1.setLastName("Bille");
        p2.setFirstName("Jane");
        p2.setLastName("Doe");
        a1 = new Animal();
        a1.setLegs(4);
        a1.setName("Milo");
        a1.setType("dog");
        a2 = new Animal();
        a2.setLegs(4);
        a2.setName("Sonny");
        a2.setType("dog");
        h = new House();
        h.setWalls(6);
        h.addAnimal(a1);
        h.addAnimal(a2);
        h.addPerson(p1);
        h.addPerson(p2);
        
    }
    
}
