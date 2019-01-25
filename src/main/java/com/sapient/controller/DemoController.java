package com.sapient.controller;

import com.sapient.model.DemoData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {
    @RequestMapping("/demo")
    public List<DemoData> getData() {
        List<DemoData> demoDataObjects = new ArrayList<>();
        DemoData demoData = new DemoData();
        demoData.setJobId("1");
        demoData.setRole("Technology Lead");
        demoData.setCompanyName("Microsoft");
        demoData.setWebsite("https://microsoft.com");
        demoData.setFullTime(true);
        demoData.setTechnology("SQL");
        demoDataObjects.add(demoData);
        return demoDataObjects;    }

}
