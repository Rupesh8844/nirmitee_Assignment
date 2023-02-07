package com.Nirmitee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nirmitee.Entity.Vehicle;
import com.Nirmitee.Service.VehicleService;

@RestController
@RequestMapping("/cars")
public class VehicleContoller {

	@Autowired
	private VehicleService vehicleService;
	
	
	@PostMapping("/")
	  public ResponseEntity<Vehicle> createVehicleHandler(@RequestBody Vehicle vehicle) {
		
	    Vehicle createdVehicle = vehicleService.createVehicle(vehicle);
	    
	    return new ResponseEntity<>(createdVehicle, HttpStatus.CREATED);
	  }
	
	
	@GetMapping("/{id}")
    public ResponseEntity<Vehicle> getVehicleHandler(@PathVariable Integer id) {
		
		Vehicle vehicle = vehicleService.getVehicleById(id);
		
		return new ResponseEntity<>(vehicle,HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/{id}")
    public ResponseEntity<Vehicle> updateVehicleHandler(@PathVariable Integer id,@RequestBody Vehicle vehicle) {
		
		Vehicle updatedVehicle = vehicleService.updateVehicle(id, vehicle);
		
		return new ResponseEntity<>(updatedVehicle,HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVehicleHandler(@PathVariable Integer id) {
		
		String string = vehicleService.deleteVehicle(id);
		
		return new ResponseEntity<>(string,HttpStatus.ACCEPTED);
	}
	
}
