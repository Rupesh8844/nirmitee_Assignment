package com.Nirmitee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
