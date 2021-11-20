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


    public Quotes(){}
    public Quotes(String body,Movies movie){
        this.body=body;
        this.movie=movie;

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "movie",referencedColumnName = "", nullable = false)
    private Movies movie;
    public Movies getMovies() {
        return movie;
    }
    public void setMovie(Movies movie){
        this.movie=movie;
    }

    @Column(name = "body", nullable = false)
    public String getBody(String body) {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() { return "Quote [id=" + id + ", Body=" + body + ", Movie=" + movie + "]";
    }

}
