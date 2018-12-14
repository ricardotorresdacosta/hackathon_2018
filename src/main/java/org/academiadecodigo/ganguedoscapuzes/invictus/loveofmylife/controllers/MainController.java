package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.controllers;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Dating;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Lover;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.DateService;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.EvaluatorService;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.LoverService;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    //private DateService dateService;
    private EvaluatorService evaluatorService;
    private LoverService loverService;
    private RatingService ratingService;



    @Autowired
    public void setEvaluatorService(EvaluatorService evaluatorService) {
        this.evaluatorService = evaluatorService;
    }

    @Autowired
    public void setLoverService(LoverService loverService) {
        this.loverService = loverService;
    }

    @Autowired
    public void setRatingService(RatingService ratingService) {
        this.ratingService = ratingService;
    }


    @GetMapping(path = {"/list"})
    public ResponseEntity<List<Lover>> list() {
        List<Lover> lovers = loverService.list();

        return new ResponseEntity<>(lovers, HttpStatus.OK);
    }


}
