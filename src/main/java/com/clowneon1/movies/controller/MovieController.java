package com.clowneon1.movies.controller;


import com.clowneon1.movies.model.Movie;
import com.clowneon1.movies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MovieController {


    private final MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieService.getAllMovies(),HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String imdbId){
        return new ResponseEntity<>(movieService.getMovieById(imdbId),HttpStatus.OK);
    }

}
