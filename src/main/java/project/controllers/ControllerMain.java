package project.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import project.entity.Client;
import project.service.ClientService;

@Controller
public class ControllerMain {
    @Autowired
    ClientService clientService;

    @RequestMapping("/")
    public ModelAndView hello() {
        Client client;
        ModelAndView model = new ModelAndView();
        client = clientService.getById(2);
        model.addObject("name", client.getLogin());
        model.setViewName("hello2");
        return model;
    }


}


