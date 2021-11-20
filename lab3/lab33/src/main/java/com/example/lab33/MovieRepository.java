package com.example.lab33;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Long>
{
    @Query(value="SELECT b.body FROM Quotes b WHERE b.id=?1")
    String findRandomQuote(Long id);

    @Query(value="SELECT b.body FROM Quotes b, Movies m WHERE b.movies=m and m.id=?1")
    List<String> findQuoteByMovie(Long id);
}
