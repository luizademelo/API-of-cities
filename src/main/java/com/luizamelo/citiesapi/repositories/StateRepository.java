package com.luizamelo.citiesapi.repositories;

import com.luizamelo.citiesapi.staties.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
