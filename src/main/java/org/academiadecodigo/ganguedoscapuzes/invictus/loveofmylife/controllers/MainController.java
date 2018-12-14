package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.controllers;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Dating;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Lover;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Profile;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
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


    @RequestMapping(path = {"/list"})
    public ResponseEntity<List<Lover>> list() {
        List<Lover> lovers = loverService.list();

        return new ResponseEntity<>(lovers, HttpStatus.OK);
    }

    @RequestMapping(path = {"/{id}"})
    public ResponseEntity<Lover> getById(@PathVariable Integer id) {
        Lover lover = loverService.findById(id);

        return new ResponseEntity<>(lover, HttpStatus.OK);
    }

    @RequestMapping(path = "/profile")
    public ResponseEntity<Profile> getProfile() {
        Profile profile = profileService.findById(99);

        return new ResponseEntity<>(profile, HttpStatus.OK);

    }


}
