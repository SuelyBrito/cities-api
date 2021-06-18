package com.github.SuelyBrito.suecitiesapi.states.repositories;
import com.github.SuelyBrito.suecitiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}