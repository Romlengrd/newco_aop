package com.andreitop.newco.service;

import com.andreitop.newco.dto.TripDto;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceDataTest {


    @Autowired
    private TripService tripService;

    private TripDto tripDto = new TripDto();

    @Test
    public void testSave() {
        tripDto.setPrice(11111);
        tripDto.setDestination("TTT");
        tripDto.setOrigin("NNN");
        tripDto.setId(1L);
        tripService.save(tripDto);
        TripDto tripDto1 = tripService.findById(1L);
        assertThat(tripDto1.getDestination()).isEqualTo(tripDto.getDestination());
    }

    @Test
    public void testUpdate() {
        TripDto tripDt = new TripDto();
        tripDt.setPrice(11111);
        tripDt.setDestination("TTT");
        tripDt.setOrigin("NNN");
        tripDt.setId(2L);
        tripService.save(tripDt);
        tripDt.setPrice(22222);
        tripService.update(tripDt);
        TripDto tripDto1 = tripService.findById(2L);
        assertThat(tripDto1.getPrice()).isEqualTo(22222);
    }

    @Test
    public void testDelete() {
        tripService.save(tripDto);
        tripService.delete(1L);
        assertThat(tripService.findById(1L)).isNull();
    }

}
