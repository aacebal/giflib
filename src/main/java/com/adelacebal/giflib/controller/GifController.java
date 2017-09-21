package com.adelacebal.giflib.controller;

import com.adelacebal.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }
    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("book-dominos", LocalDate.of(2015, 2, 13), "Adel Acebal", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
