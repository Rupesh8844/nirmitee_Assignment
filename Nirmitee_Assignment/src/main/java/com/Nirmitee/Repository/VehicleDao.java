package com.Nirmitee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nirmitee.Entity.Vehicle;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle, Integer>{

}
