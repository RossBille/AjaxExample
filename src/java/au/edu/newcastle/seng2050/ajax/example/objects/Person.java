package au.edu.newcastle.seng2050.ajax.example.objects;

/**
 *
 * @author Ross
 */
public class Person extends AjaxObjects {

    private String firstName;
    private String lastName;
    private float height;

    public Person() 
    {
        firstName = lastName = "N/A";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toJson() {
        return "{\"firstName\":\"" + firstName
                + "\",\"lastName\":\"" + lastName 
                + "\",\"height\":" + height +"}";
    }

    @Override
    public String toXml() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
