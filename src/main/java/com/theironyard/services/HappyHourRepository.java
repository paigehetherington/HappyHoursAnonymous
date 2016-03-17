package com.theironyard.services;

import com.theironyard.entities.HappyHour;
import org.springframework.data.repository.CrudRepository;
import sun.security.ssl.HandshakeOutStream;

import java.util.List;

/**
 * Created by vajrayogini on 3/17/16.
 */
public interface HappyHourRepository extends CrudRepository<HappyHour, Integer> {
//    List<HappyHour> findByOnMonday (boolean onMonday);
//    List<HappyHour> findByOnTuesday (boolean onTuesday);
//    List<HappyHour> findByOnWednesday (boolean onWednesday);
//    List<HappyHour> findByOnThursday (boolean onThursday);
//    List<HappyHour> findByOnFriday (boolean onFriday);
//    List<HappyHour> findByOnSaturday (boolean onSaturday);
//    List<HappyHour> findByOnSunday (boolean OnSunday);
    List<HappyHour> findByCity (String city);
    List<HappyHour> findByName (String name);

}



