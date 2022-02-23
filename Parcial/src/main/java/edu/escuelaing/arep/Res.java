package edu.escuelaing.arep;

import java.io.IOException;

public class Res {
    public static String getInstance()throws IOException{
        String outputLine;
          outputLine = "<!DOCTYPE html>"
            + "<html>"
            + "<head>"
            + "<meta charset=\"UTF-8\">"
            + "<title>Parcial</title>\n"
            + "</head>"
            + "<body>"
            + "<h1>"
            + "Ciudad"
            + "</h1>"
            + "<p>"
            + "https://api.openweathermap.org/data/2.5/weather?q=london&appid=5f8afd3074c154b26c51779cd5f5b3c0"
            + "<p>"
            + "<p>"
            + "Al mandar q=Ciudad se retornara un json con los datos climaticos correspondientes"
            + "<p>"
            + "</body>"
            + "</html>";
        out.println(outputLine);

        return outputLine;
    }

}
