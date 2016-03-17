package com.theironyard.controllers;

import com.theironyard.services.HappyHourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vajrayogini on 3/17/16.
 */
@RestController
public class HappyHourController {


@Autowired
    HappyHourRepository happyHours;

}
