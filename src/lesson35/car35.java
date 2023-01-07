package lesson35;

public class car35 {
    private String make;
    private String model;
    private int year;

    car35(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
        // this.make = make;
        // this.model = model;
        // this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void coppy(car35 x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

}
