package Modules;

public class Hospital {

    protected String name;
    protected String location;
    protected int capacity;

    public Hospital(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Hospital information: " +
                " name: " + name + '\'' +
                " location: " + location + '\'' +
                " capacity: " + capacity;
    }
}

