package com.andreitop.newco.repository;

import com.andreitop.newco.dto.TripDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepositoryData extends JpaRepository<TripDto, Long> {
//    @Query("update TripDto t set t.origin = :origin, t.destination = :destination, t.price = :price where t.id = :id")
//    void update(@Param("t") TripDto t);
}
