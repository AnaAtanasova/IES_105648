package com.example.lab33;

import javax.persistence.*;
import java.util.List;
import java.util.Random;

@Entity
@Table(name="quotes")
public class Quotes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String body;
    Movies movies;


    public Quotes(){}
    public Quotes(String body,Movies movies){
        this.body=body;
        this.movies=movies;

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "body", nullable = false)
    public String getBody(String body) {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getMovies() {
        int num_shows=movies.length;
        String Lista="";
        for (int i = 0; i < num_shows; i++) {
            Lista+=" "+i+" "+shows[i]+" ";
        }

   /* @ManyToOne(mappedBy = "movie")
    private List<Quotes> quotes;*/
}
