package ru.timokhina.lesson20;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
    public static void main(String[] args) throws Exception {
        IndianCities indianCities = new IndianCities();
        indianCities.setCity("Дели");
        indianCities.setState("Делиштат");
        indianCities.setDistrict("Делирайон");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(indianCities));
    }
}
