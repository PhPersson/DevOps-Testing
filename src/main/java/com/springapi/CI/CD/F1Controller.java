package com.springapi.CI.CD;


import org.springframework.web.bind.annotation.*;


@RestController
public class F1Controller {

    @GetMapping("/drivers")
    public String f1Drivers() {
        return "Returns the F1 drivers of season 2024";
    }

    @GetMapping("/driver/{id}")
    public String driver() {
//        @PathVariable Long id
        return "Returns a specific F1 driver";
    }

}
