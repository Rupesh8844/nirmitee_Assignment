package com.Nirmitee.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "vehicles")
public class Vehicle {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
  
	
	@NotNull
	private String conditions;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "details_id", referencedColumnName = "id")
   private VehicleDetails details;
  
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "location_id", referencedColumnName = "id")
   private VehicleLocation location;

}
