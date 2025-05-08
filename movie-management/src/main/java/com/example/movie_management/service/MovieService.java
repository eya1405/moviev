package com.example.movie_management.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.movie_management.model.Movie;
import com.example.movie_management.repository.MovieRepository;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repo;

    public List<Movie> getAllMovies() {
        return repo.findAll();
    }

    public Movie addMovie(Movie movie) {
        return repo.save(movie);
    }

    // autres méthodes (update, delete, etc.)
}
