package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.controllers;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Dating;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Lover;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Profile;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    //private DateService dateService;
    private LoverService loverService;
    private ProfileService profileService;

    @Autowired
    public void setProfileService(ProfileService profileService) {
        this.profileService = profileService;
    }


    @Autowired
    public void setLoverService(LoverService loverService) {
        this.loverService = loverService;
    }


    @GetMapping(path = {"/list"})
    public ResponseEntity<List<Lover>> list() {
        List<Lover> lovers = loverService.list();

        return new ResponseEntity<>(lovers, HttpStatus.OK);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Lover> getById(@PathVariable Integer id) {
        Lover lover = loverService.findById(id);

        return new ResponseEntity<>(lover, HttpStatus.OK);
    }

    @GetMapping(path = "/profile")
    public ResponseEntity<Profile> getProfile() {
        Profile profile = profileService.findById(99);

        return new ResponseEntity<>(profile, HttpStatus.OK);

    }


}
