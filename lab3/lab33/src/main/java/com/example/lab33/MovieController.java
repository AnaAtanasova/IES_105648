package com.example.lab33;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class MovieController {

        private static final String template = "Quote: %s!";
        private static final String template1 = "Movie: %s!";

        @GetMapping("/api/movie")
        public String movie(@RequestParam(value = "title", defaultValue = "Error") String title) {
            Movies movie1=new Movies();
            return String.format(template,movie1);
        }

        @GetMapping("/api/quotes")
        public String quotes(@RequestParam(required = true) Long movie) {
            List<String> allQuotesFromMovies=
        }

        @GetMapping("/api/randomMovie")
        public String randomQuotes(@RequestParam(value = "title", required = false, defaultValue = "Error") int title, Model model) {
        model.addAttribute("name",title);
        Movies movie=new Movies();
        String quote1=r1.getQuotes();
        return String.format(template,quote1);
    }
    }

