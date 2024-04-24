package com.springapi.CI.CD;


import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;


@RestController
public class F1Controller {

    private final List<F1Driver> drivers = Arrays.asList(
            new F1Driver("Max Verstappen", 1, "RED BULL RACING HONDA RBPT", "NED"),
            new F1Driver("Sergio Perez", 2, "RED BULL RACING HONDA RBPT", "MEX"),
            new F1Driver("Charles Leclerc", 3, "FERRARI", "MON"),
            new F1Driver("Carlos Sainz", 4, "FERRARI", "ESP"),
            new F1Driver("Lando Norris", 5, "MCLAREN MERCEDES", "GBR"),
            new F1Driver("Oscar Piastri", 6, "MCLAREN MERCEDES", "AUS"),
            new F1Driver("George Russell", 7, "MERCEDES", "GBR"),
            new F1Driver("Fernando Alonso", 8, "ASTON MARTIN ARAMCO MERCEDES", "ESP"),
            new F1Driver("Lewis Hamilton", 9, "MERCEDES", "GBR"),
            new F1Driver("Lance Stroll", 10, "ASTON MARTIN ARAMCO MERCEDES", "CAN"),
            new F1Driver("Yuki Tsunoda", 11, "RB HONDA RBPT", "JPN"),
            new F1Driver("Oliver Bearman", 12, "FERRARI", "GBR"),
            new F1Driver("Nico Hulkenberg", 13, "HAAS FERRARI", "GER"),
            new F1Driver("Kevin Magnussen", 14, "HAAS FERRARI", "DEN"),
            new F1Driver("Alexander Albon", 15, "WILLIAMS MERCEDES", "THA"),
            new F1Driver("Esteban Ocon", 16, "ALPINE RENAULT", "FRA"),
            new F1Driver("Zhou Guanyu", 17, "KICK SAUBER FERRARI", "CHN"),
            new F1Driver("Daniel Ricciardo", 18, "RB HONDA RBPT", "AUS"),
            new F1Driver("Pierre Gasly", 19, "ALPINE RENAULT", "FRA"),
            new F1Driver("Valtteri Bottas", 20, "KICK SAUBER FERRARI", "FIN"),
            new F1Driver("Logan Sargeant", 21, "WILLIAMS MERCEDES", "USA"));

    @GetMapping("/drivers")
    public String f1Drivers() {
        return drivers.toString();
    }

    @GetMapping("/driver/{id}")
    public F1Driver getDriverById(@PathVariable int id) {
        return drivers.stream()
                .filter(driver -> driver.getId() == id)
                .findFirst()
                .orElse(null);
    }


}
