package com.theironyard.services;

import com.theironyard.entities.HappyHour;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vajrayogini on 3/17/16.
 */
public interface HappyHourRepository extends CrudRepository<HappyHour, Integer> {

}
