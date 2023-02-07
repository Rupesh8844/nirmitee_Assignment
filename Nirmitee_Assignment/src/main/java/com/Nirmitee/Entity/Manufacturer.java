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
@Table(name = "manufacturer")
public class Manufacturer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

  private Integer code;

  private String name;
	
}
