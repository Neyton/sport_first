package project.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import project.entity.ClientsEntity;
import project.entity.EventsEntity;
import project.entity.RateEventEntity;
import project.entity.TypeRateEntity;
import project.service.ClientService;
import project.service.EventService;
import project.service.RateEventService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

}


