package com.Nirmitee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nirmitee.Entity.Manufacturer;

@Repository
public interface ManufacturerDao extends JpaRepository<Manufacturer, Integer>{

}
