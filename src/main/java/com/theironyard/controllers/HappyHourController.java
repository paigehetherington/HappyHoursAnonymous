package com.theironyard.controllers;

import com.theironyard.entities.HappyHour;
import com.theironyard.services.HappyHourRepository;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by vajrayogini on 3/17/16.
 */
@RestController
public class HappyHourController {



@Autowired
    HappyHourRepository happyHours;

    @RequestMapping(path = "/happy_hour", method = RequestMethod.GET)
    public List<HappyHour> getHappyHours() {
        return (List<HappyHour>) happyHours.findAll();
    }

    @RequestMapping(path = "/happy_hour", method = RequestMethod.POST)
    public void addHappyHour(@RequestBody HappyHour happyHour) {
        happyHours.save(happyHour);
    }

    @RequestMapping(path = "/happy_hour", method = RequestMethod.PUT)
    public void updateHappyHour(@RequestBody HappyHour happyHour) {
        happyHours.save(happyHour);
    }

    @RequestMapping(path = "/happy_hour/{id}", method = RequestMethod.DELETE)
    public void deleteHappyHour(@PathVariable("id") int id) {
        happyHours.delete(id);
    }

//    @RequestMapping(path = "/happy_hour", method = RequestMethod.GET)
//    public List<HappyHour> searchByDay (@PathVariable("onMonday") boolean onMonday) {
//        return (List<HappyHour>) happyHours.findByOnMonday(true);
//    }

    @RequestMapping(path = "/happy_hour/{city}", method = RequestMethod.GET)
    public List<HappyHour> searchByCity(@PathVariable("city") String city) {
        return happyHours.findByCity(city);
    }

    @RequestMapping(path = "/happy_hour/{name}", method = RequestMethod.GET)
    public List<HappyHour> searchByName(@PathVariable("name") String name) {
        return happyHours.findByName(name);
    }


}
