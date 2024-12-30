package com.dirmilli.notDefteri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dirmilli.notDefteri.entities.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

}
