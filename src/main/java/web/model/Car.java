package web.model;

public class Car {
    private String model;
    private String series;
    private int coast;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public Car(String model, String series, int coast) {
        this.model = model;
        this.series = series;
        this.coast = coast;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

}
