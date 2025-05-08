package com.example.movie_management.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.example.movie_management.model.Movie;
import com.example.movie_management.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping
    public List<Movie> getAll() {
        return service.getAllMovies();
    }

    @PostMapping
    public Movie add(@RequestBody Movie movie) {
        return service.addMovie(movie);
    }

    // autres endpoints
}

