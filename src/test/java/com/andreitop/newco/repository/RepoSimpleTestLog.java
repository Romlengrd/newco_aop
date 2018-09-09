package com.andreitop.newco.repository;

import com.andreitop.newco.dto.TripDto;
import com.andreitop.newco.repository.TripRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepoSimpleTestLog {

    @Autowired
    private TripRepository tripRepository;

    private TripDto tripDto = new TripDto();

    @Before
    public void setTrip() {
        tripDto.setId(1L);
        tripDto.setOrigin("LLL");
        tripDto.setDestination("YYY");
        tripDto.setPrice(3333);
    }


    @Test
    public void testAdd() {
        tripRepository.save(tripDto);
    }

    @Test
    public void testUpd() {
        tripDto.setPrice(88888);
        tripRepository.update(tripDto);
    }

    @Test
    public void testDelete() {
        tripRepository.delete(1L);
    }

}
