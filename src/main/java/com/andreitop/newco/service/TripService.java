package com.andreitop.newco.service;

import com.andreitop.newco.dto.TripDto;
import com.andreitop.newco.repository.TripRepositoryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TripService {

    private final TripRepositoryData tripRepository;

    @Autowired
    public TripService(TripRepositoryData tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<TripDto> findAll() {
        return tripRepository.findAll();
    }

    public TripDto findById(Long id) {
        Optional<TripDto> opt= tripRepository.findById(id);
        TripDto tripDto1 = opt.orElse(null);
        return tripDto1;
    }

    public void save(TripDto trip) {
        tripRepository.save(trip);
    }

    public void delete(Long id) {
        tripRepository.deleteById(id);
    }

    public void update(TripDto newTrip) {
        tripRepository.saveAndFlush(newTrip);
    }
}
