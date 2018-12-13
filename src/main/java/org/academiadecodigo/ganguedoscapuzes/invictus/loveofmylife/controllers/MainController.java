package org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.controllers;

import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.persistence.model.Date;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.DateService;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.EvaluatorService;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.LoverService;
import org.academiadecodigo.ganguedoscapuzes.invictus.loveofmylife.services.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    private DateService dateService;
    private EvaluatorService evaluatorService;
    private LoverService loverService;
    private RatingService ratingService;


    public void setDateService(DateService dateService) {
        this.dateService = dateService;
    }

    public void setEvaluatorService(EvaluatorService evaluatorService) {
        this.evaluatorService = evaluatorService;
    }

    public void setLoverService(LoverService loverService) {
        this.loverService = loverService;
    }

    public void setRatingService(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    public DateService getDateService() {
        return dateService;
    }

    public EvaluatorService getEvaluatorService() {
        return evaluatorService;
    }

    public LoverService getLoverService() {
        return loverService;
    }

    public RatingService getRatingService() {
        return ratingService;
    }

    @GetMapping(path={"/list"})
    public ResponseEntity<List<Date>> list(){
        List<Date> dates = dateService.list();
        return new ResponseEntity<>(dates, HttpStatus.OK);
    }
}
