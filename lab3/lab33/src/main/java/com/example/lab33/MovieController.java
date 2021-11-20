package com.example.lab33;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
    public class MovieController {

    private static final String template = "Quote: %s!";
    private static final String template1 = "Movie: %s!";

    @GetMapping("/api/movie")
    public String movie(@RequestParam(value = "title", defaultValue = "Error") String title) {
        Movies movie1 = new Movies();
        return String.format(template, movie1);
    }

    @GetMapping("/api/quotes")
    public String QuotefromMovies(@RequestParam(required = true) Long movie) {
        List<String> allQuotesFromMovies = MovieRepository.findQuoteByMovie(movie);
        int num = allQuotesFromMovies.size();
        Random random = new Random();
        try {
            int randInt = random.nextInt(num);
            return allQuotesFromMovies.get(randInt);
        } catch (Exception e) {
            return "Not found";

        }
    }
}


