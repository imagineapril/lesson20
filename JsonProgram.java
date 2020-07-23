package ru.timokhina.lesson20;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;
import java.util.List;
import java.util.Map;

public class JsonProgram {
    public static void main(String[] args) throws Exception {

        URL jsonUrl = new URL("https://indian-cities-api-nocbegfhqg.now.sh/cities");
        ObjectMapper mapper = new ObjectMapper();
        Map map = mapper.readValue(jsonUrl, Map.class);
        System.out.println(map);
        //Response response = mapper.readValue(jsonUrl, Response.class);
        //List<IndianCities>indianCities= mapper.readValue (jsonUrl, List.class);
//        for (IndianCities indianCities1 : response.getData()) {
//            System.out.printf("%d %s %n", indianCities1.getCity(), indianCities1.getState(), indianCities1.getDistrict());
//        }
//        System.out.println(response.getData().toString());
    }
}
