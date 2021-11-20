package com.example.lab33;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private long year;

    public Movies() {}

    public Movies(String title, long year) {
        this.title=title;
        this.year=year;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "year", nullable = false)
    public long getYear() {
        return year;
    }
    public void setYear(long year) {
        this.year = year;
    }

    @OneToMany(mappedBy = "movie", targetEntity = Quotes.class, cascade= CascadeType.ALL)
    private List<Quotes> quotes;

    @Override
    public String toString() { return "Movie [id=" + id + ", Title=" + title + ", Year=" + year + "]";
    }

}
