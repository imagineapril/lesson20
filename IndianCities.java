package ru.timokhina.lesson20;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class IndianCities {
    private String City;
    private String State;
    private String District;

    public void setCity(String city) {
        City = city;
    }

    public void setState(String state) {
        State = state;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getDistrict() {
        return District;
    }

    @Override
    public String toString() {
        return "Есть такой индийский город{" +
                "Город='" + City + '\'' +
                ", Штат=" + State +
                ", Район=" + District +
                '}';
    }


}
