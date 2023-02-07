package com.Nirmitee.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "vehicle_locations")
public class VehicleLocation {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		  
		private Double lat;
		private Double lon;
	
}
