package com.movie.booking.controller;

import java.util.List;

import com.movie.booking.model.Screen;
import com.movie.booking.service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ScreenController {

    @Autowired
    private ScreenService screenService;

    @GetMapping("/allscreens")
    public List<Screen> findAllScreen() {
        return (List<Screen>) screenService.getAllScreen();
    }

    @GetMapping("/screen/{screen_id}")
    public ResponseEntity<?> getScreenById(@PathVariable Long screen_id) {
        Screen screen = screenService.getScreenById(screen_id);
        return ResponseEntity.status(HttpStatus.OK).body(screen);
    }


}