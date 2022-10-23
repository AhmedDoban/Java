public class Pharmacy {
    private String Name;
    private String For;
    private String pharmacy;
    private String location;

    public Pharmacy(String name, String forwhat, String pharmacy, String location) {
        setName(name);
        setFor(forwhat);
        setPharmacy(pharmacy);
        setLocation(location);
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getPharmacy() {
        return pharmacy;
    }
    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }
    public String getFor() {
        return For;
    }
    public void setFor(String aFor) {
        this.For = aFor;
    }

    public void setName(String name) {
        if(!name.isEmpty())
            this.Name = name;
        else
            System.out.println("you must type a name ");
    }
    public String getName() {
        return Name;
    }
}
