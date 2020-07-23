package ru.timokhina.lesson20;

public class Response {

    private String status;
    private IndianCities[] data;
    private String City;

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public IndianCities[] getData() {
        return data;
    }

    public void setData(IndianCities[] data) {
        this.data = data;
    }
}
