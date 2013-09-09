/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.newcastle.seng2050.ajax.example.objects;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ross
 */
public class House extends AjaxObjects
{
    private int walls;
    private List<Animal> animals;
    private List<Person> people;
    
    public House() 
    {
        animals = new ArrayList<Animal>();
        people = new ArrayList<Person>();
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }
    public void addPerson(Person person)
    {
        people.add(person);
    }
    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }
    @Override
    public String toJson() {
        String str =  "{\"walls\":" + walls +", \"people\":[";
        if(people.size() > 0)
        {
            for(int i=0; i<people.size()-1; i++)
            {
                str += people.get(i).toJson() + ", ";
            }
            str+= people.get(people.size()-1).toJson() +"]";
        }
        str +=  ", \"animals\":[";
        if(animals.size() > 0)
        {
            for(int i=0; i<animals.size()-1; i++)
            {
                str += animals.get(i).toJson() + ", ";
            }
            str+= animals.get(animals.size()-1).toJson() +"]";
        }
        str+="}";
        return str;
    }

    @Override
    public String toXml() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
