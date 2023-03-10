package com.Nirmitee.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
