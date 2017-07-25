public class Building {

    private String location;
    private int sqFt;

    //Never be able to use building without location or sqFt

    public Building(String location, int sqFt){
        this.location = location;
        this.sqFt = sqFt;

    }
//Generate- Getters and Setters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }
}

