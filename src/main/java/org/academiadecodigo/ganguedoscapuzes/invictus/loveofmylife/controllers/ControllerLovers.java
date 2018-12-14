package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.controllers;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Lover;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.LoverService;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/lover")
public class ControllerLovers {

    private LoverService loverService;
    private ProfileService profileService;


    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public String list(Model model){

        List<Lover> lovers = loverService.list();
        model.addAttribute("users", lovers);
        return "user/users";
    }









    @Autowired
    public void setProfileService(ProfileService profileService) {
        this.profileService = profileService;
    }


    @Autowired
    public void setLoverService(LoverService loverService) {
        this.loverService = loverService;
    }

}
