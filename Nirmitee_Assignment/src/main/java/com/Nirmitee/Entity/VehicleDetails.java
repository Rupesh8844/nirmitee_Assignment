package com.Nirmitee.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "vehicle_details")
public class VehicleDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	  
	  private String body;
	  private String model;
	  
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "manufacturer_id", referencedColumnName = "id")
	  private Manufacturer manufacturer;
	  
	  private Integer numberOfDoors;
	  private String fuelType;
	  private String engine;
	  private Integer mileage;
	  private Integer modelYear;
	  private Integer productionYear;
	  private String externalColor;
	
}
