package au.edu.newcastle.seng2050.ajax.example.objects;

/**
 *
 * @author Ross
 */
public class Animal extends AjaxObjects
{
    private String type;
    private String name;
    private int legs;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Animal() {
        type = name = "N/A"; 
    }
    @Override
    public String toJson() {
        return "{\"type\":\"" + type
                + "\",\"name\":\"" + name 
                + "\",\"legs\":" + legs +"}";
    }

    @Override
    public String toXml() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
