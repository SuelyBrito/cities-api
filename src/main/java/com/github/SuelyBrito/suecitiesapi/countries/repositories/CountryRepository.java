package com.github.SuelyBrito.suecitiesapi.countries.repositories;

import com.github.SuelyBrito.suecitiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}