package net.lermex.inaction.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * Created by Vlad on 27.01.2016.
 */
@Controller
public class StatisticsController {

    @RequestMapping(value = "/statisticsController")
    @ResponseBody
    public String index() {

        Random rand = new Random();
        int monday = rand.nextInt(100);
        int tuesday = rand.nextInt(100);
        int wednesday = rand.nextInt(100);
        int thuesday = rand.nextInt(100);
        int friday = rand.nextInt(100);

        String array = monday + "," + tuesday + "," + wednesday + "," + thuesday + "," + friday;
/*
        Model mav = null;

        mav.addAttribute("monday", monday);
        mav.addAttribute("tuesday", tuesday);
        mav.addAttribute("wednesday", wednesday);
        mav.addAttribute("thursday", thuesday);
        mav.addAttribute("friday", friday);*/
        return array;
    }
}