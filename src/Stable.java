public class Stable {
    private String location;
    private String box;
    private String farm;

    public Stable() {
        this.location = "Not set";
        this.box = "Not set";
        this.farm = "Not set";
    }

    public Stable(String location, String box, String farm) {
        this.location = location;
        this.box = box;
        this.farm = farm;
    }

    public String getLocation() {
        return location;
    }

    public String getBox() {
        return box;
    }

    public String getFarm() {
        return farm;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    @Override
    public String toString(){
        return "Location: "+ location + "\nBox: " + box + "\nFarm: " + farm;
    }
}
