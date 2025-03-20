package com.springboot.repo;
import java.util.*;
import com.springboot.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienRepo extends JpaRepository<Alien,Integer> {
    List<Alien> findByAname(String aname);

    @Query("from Alien where aname= :name")
    List<Alien> find(@Param("name") String aname);
}
