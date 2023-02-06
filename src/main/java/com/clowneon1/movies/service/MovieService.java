package com.clowneon1.movies.service;

import com.clowneon1.movies.model.Movie;
import com.clowneon1.movies.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {


    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }


    public Optional<Movie> getMovieById(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
