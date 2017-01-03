package by.dreamteam.sportfirst.controllers;


import by.dreamteam.sportfirst.service.EventService;
import by.dreamteam.sportfirst.service.RateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import by.dreamteam.sportfirst.entity.EventsEntity;

import java.util.ArrayList;

@Controller
public class ControllerMain {

    @Autowired
    EventService eventService;

    @Autowired
    RateEventService rateEventService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView();
        EventsEntity event;
        ArrayList<EventsEntity> listEvent = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            event = eventService.getEventById(i);
            listEvent.add(event);
            model.addObject("listRate" + Integer.toString(i), rateEventService.findByEventEntityId(i));
        }
        model.addObject("listEvent", listEvent);
        model.setViewName("index");
        return model;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/user")
    public String user() { return "user";}

    @RequestMapping("/admin")
    public String admin() {

        return "admin";
    }



}


