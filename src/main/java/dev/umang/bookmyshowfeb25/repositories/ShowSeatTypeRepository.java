package dev.umang.bookmyshowfeb25.repositories;

import dev.umang.bookmyshowfeb25.models.Show;
import dev.umang.bookmyshowfeb25.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
    List<ShowSeatType> findAllByShow(Show show);


    /*
    3 ways
    1. Declared queries
    2. HQL - Hibernate query sql
    3. Native SQL queries


     */

    /*
    1
     */
}
